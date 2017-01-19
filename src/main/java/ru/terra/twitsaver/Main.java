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
import ru.terra.dms.configuration.Configuration;
import ru.terra.dms.configuration.bean.Pojo;
import ru.terra.dms.rest.RestService;
import ru.terra.dms.shared.dto.ObjectDTO;
import ru.terra.server.dto.LoginDTO;
import ru.terra.twitsaver.dto.Medium;
import ru.terra.twitsaver.dto.Twit;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static String USER = "awd";
    public static String PASS = "awd";

    public static void run(String... tag) throws InterruptedException, IOException {
        Client client = null;
        try {
            LoginDTO ret = RestService.getInstance().login(USER, PASS);
            if (ret.logged)
                RestService.getInstance().setSession(ret.session);
            final RestService restService = RestService.getInstance();
            final Configuration configuration = restService.loadConfiguration();
            System.out.println(configuration.toString());
            final Pojo md5Pojo = configuration.getPojo("TerraFile");
            System.out.println(md5Pojo.toString());
            ExecutorService service = Executors.newFixedThreadPool(30);
            BlockingQueue<String> queue = new LinkedBlockingQueue<>(10000);
            StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
            endpoint.followings(Lists.newArrayList(558929794L, 2224934952L, 256253131L));
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
                    int MESSAGES = 1;
                    if (queue.size() > MESSAGES) {
                        List<String> messages = new ArrayList();
                        queue.drainTo(messages, queue.size());
                        service.submit(() -> {
                                    for (String msg : messages) {
                                        try {
                                            Twit twit = new ObjectMapper().readValue(msg, Twit.class);
                                            service.submit(() -> saveTwit(restService, twit));
                                            List<Medium> media = twit.getEntities().getMedia();
                                            if (media.size() > 0) {
//                                                LoggerFactory.getLogger(Main.class).info(msg);
                                                service.submit(() -> media.forEach(m -> downloadImage(restService, "images/" + produceFileName(), m.getMediaUrl())));
                                            }
                                            if (twit.getExtendedEntities() != null && twit.getExtendedEntities().getMedia() != null && twit.getExtendedEntities().getMedia().size() > 0) {
                                                List<Medium> extendedMedia = twit.getExtendedEntities().getMedia();
                                                service.submit(() -> extendedMedia.stream().filter(m -> !m.getType().equals("photo")).filter(m -> m.getAdditionalProperties().containsKey("video_info")).forEach(m -> {
                                                    Map video_info = (Map) m.getAdditionalProperties().get("video_info");
                                                    List variants = (List) video_info.get("variants");
                                                    if (variants.size() > 0)
                                                        for (Object v : variants)
                                                            if (((Map) v).containsKey("url"))
                                                                downloadImage(restService, "images/" + produceFileName(), (String) ((Map) v).get("url"));
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

    public static void saveTwit(RestService restService, Twit twit) {
        ObjectDTO dto = new ObjectDTO();
        dto.id = 0;
        dto.type = "TwitterMessage";
        dto.fields = new HashMap<>();
        dto.fields.put("idstr", twit.getIdStr());
        dto.fields.put("lang", twit.getLang());
        dto.fields.put("text", twit.getText());
        dto.fields.put("ts", twit.getTimestampMs());
        dto.fields.put("userid", twit.getUser().getIdStr());
        dto.fields.put("username", twit.getUser().getName());

        try {
            System.out.println("Saving twit " + twit.getIdStr() + ": Result: " + restService.createObjects(new ObjectMapper().writeValueAsString(dto)).errorCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void downloadImage(RestService restService, String folder, String url) {
        ObjectDTO dto = new ObjectDTO();
        dto.id = 0;
        dto.type = "TerraFile";
        dto.fields = new HashMap<>();
        dto.fields.put("url", url);
        dto.fields.put("folder", folder);
        dto.fields.put("needcheck", Boolean.toString(true));

        try {
            System.out.println("Save image " + url + ": Result: " + restService.createObjects(new ObjectMapper().writeValueAsString(dto)).errorCode);
        } catch (Exception e) {
            e.printStackTrace();
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
