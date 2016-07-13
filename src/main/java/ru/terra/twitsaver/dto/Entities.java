package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "hashtags",
        "trends",
        "urls",
        "user_mentions",
        "symbols",
        "media"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = new ArrayList<Hashtag>();
    @JsonProperty("trends")
    private List<Object> trends = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Url> urls = new ArrayList<Url>();
    @JsonProperty("user_mentions")
    private List<Object> userMentions = new ArrayList<Object>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("media")
    private List<Medium> media = new ArrayList<Medium>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The hashtags
     */
    @JsonProperty("hashtags")
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    /**
     * @param hashtags The hashtags
     */
    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    /**
     * @return The trends
     */
    @JsonProperty("trends")
    public List<Object> getTrends() {
        return trends;
    }

    /**
     * @param trends The trends
     */
    @JsonProperty("trends")
    public void setTrends(List<Object> trends) {
        this.trends = trends;
    }

    /**
     * @return The urls
     */
    @JsonProperty("urls")
    public List<Url> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    @JsonProperty("urls")
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    /**
     * @return The userMentions
     */
    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    /**
     * @param userMentions The user_mentions
     */
    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    /**
     * @return The symbols
     */
    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    /**
     * @param symbols The symbols
     */
    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    /**
     * @return The media
     */
    @JsonProperty("media")
    public List<Medium> getMedia() {
        return media;
    }

    /**
     * @param media The media
     */
    @JsonProperty("media")
    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
