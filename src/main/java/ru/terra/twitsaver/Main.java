package ru.terra.twitsaver;

/**
 * Date: 21.06.15
 * Time: 11:19
 */

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;
import org.apache.log4j.BasicConfigurator;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.LoggerFactory;
import ru.terra.twitsaver.dto.Medium;
import ru.terra.twitsaver.dto.Twit;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void run(String... tag) throws InterruptedException, IOException {
        Client client = null;
        try {
            ExecutorService service = Executors.newFixedThreadPool(30);
            BlockingQueue<String> queue = new LinkedBlockingQueue<>(10000);
            StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
            endpoint.followings(Lists.newArrayList(558929794L));
            Authentication auth = new OAuth1("mxkj9PpSNFO7Qgkmpasq1ec4S", "nLtcxVNsnT3lhtSf9qraSlEJ6u4uK9m0jRR0JIHBEBzZnnJTEc", "2550132680-cPN1zH41SJMnSzPEgp7eyouaCXbZYIE6sOCVDIv", "TzCBXwp7elFJZQqIs869EVtB03WskjuULhWLuHC9fRkBG");
            client = new ClientBuilder()
                    .hosts(Constants.STREAM_HOST)
                    .endpoint(endpoint)
                    .authentication(auth)
                    .processor(new StringDelimitedProcessor(queue))
                    .build();

            // Establish a connection
            client.connect();
            new Thread(() -> {
                while (true) {
                    int MESSAGES = 20;
                    if (queue.size() > MESSAGES) {
                        List<String> messages = new ArrayList();
                        queue.drainTo(messages, 20);
                        service.submit(() -> {
                                    for (String msg : messages) {
                                        try {
                                            Twit twit = new ObjectMapper().readValue(msg, Twit.class);
                                            List<Medium> media = twit.getEntities().getMedia();
                                            if (media.size() > 0) {
                                                LoggerFactory.getLogger(Main.class).info(msg);
                                                service.submit(() -> media.forEach(m -> downloadImage("images/" + produceFileName(), m.getMediaUrl())));
                                            }
                                            if (twit.getExtendedEntities() != null && twit.getExtendedEntities().getMedia() != null && twit.getExtendedEntities().getMedia().size() > 0) {
                                                List<Medium> extendedMedia = twit.getExtendedEntities().getMedia();
                                                service.submit(() -> extendedMedia.stream().filter(m -> !m.getType().equals("photo")).filter(m -> m.getAdditionalProperties().containsKey("video_info")).forEach(m -> {
                                                    Map video_info = (Map) m.getAdditionalProperties().get("video_info");
                                                    List variants = (List) video_info.get("variants");
                                                    if (variants.size() > 0) {
                                                        for (Object v : variants) {
                                                            Map variant = (Map) v;
                                                            if (variant.containsKey("url"))
                                                                downloadImage("images/" + produceFileName(), (String) variant.get("url"));
                                                        }
                                                    }
                                                }));
                                            }
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                        );
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            ).start();
            while (true) {
                Thread.sleep(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (client != null)
                client.stop();
        }
    }

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        try {
            Main.run(args);
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadImage(String folder, String url) {
        File f = new File(folder);
        if (!f.exists()) {
            f.mkdirs();
        }
        for (int i = 0; i <= 2; ++i) {
            try {
                URL imageUrl = new URL(url);
                Path path = Paths.get(folder + url.substring(url.lastIndexOf("/")), new String[0]);
                if (!path.toFile().exists()) {
                    Files.copy(imageUrl.openStream(), path, StandardCopyOption.REPLACE_EXISTING);
                }
                LoggerFactory.getLogger(Main.class).info("Downloaded: " + url);
                break;
            } catch (Exception e) {
                LoggerFactory.getLogger(Main.class).error("Unable to download: " + url, e);
                continue;
            }
        }
    }

    public static String produceFileName() {
        Calendar twitDate = Calendar.getInstance();
        twitDate.setTime(new Date());
        String folderName = String.valueOf(twitDate.get(Calendar.MONTH) + 1);
        folderName += "/";
        folderName += twitDate.get(Calendar.DAY_OF_MONTH);
        folderName += "/";
        return folderName;
    }
}
