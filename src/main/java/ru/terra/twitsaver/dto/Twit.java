package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "created_at",
        "id",
        "id_str",
        "text",
        "source",
        "truncated",
        "in_reply_to_status_id",
        "in_reply_to_status_id_str",
        "in_reply_to_user_id",
        "in_reply_to_user_id_str",
        "in_reply_to_screen_name",
        "user",
        "geo",
        "coordinates",
        "place",
        "contributors",
        "retweeted_status",
        "retweet_count",
        "favorite_count",
        "entities",
        "extended_entities",
        "favorited",
        "retweeted",
        "possibly_sensitive",
        "filter_level",
        "lang",
        "timestamp_ms"
})
public class Twit {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("user")
    private User user;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("retweeted_status")
    private RetweetedStatus retweetedStatus;
    @JsonProperty("retweet_count")
    private Long retweetCount;
    @JsonProperty("favorite_count")
    private Long favoriteCount;
    @JsonProperty("entities")
    private Entities entities;
    @JsonProperty("extended_entities")
    private ExtendedEntities extendedEntities;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("possibly_sensitive")
    private Boolean possiblySensitive;
    @JsonProperty("filter_level")
    private String filterLevel;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("timestamp_ms")
    private String timestampMs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The idStr
     */
    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    /**
     * @param idStr The id_str
     */
    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    /**
     * @return The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The truncated
     */
    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * @param truncated The truncated
     */
    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * @return The inReplyToStatusId
     */
    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     * @param inReplyToStatusId The in_reply_to_status_id
     */
    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     * @return The inReplyToStatusIdStr
     */
    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    /**
     * @param inReplyToStatusIdStr The in_reply_to_status_id_str
     */
    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    /**
     * @return The inReplyToUserId
     */
    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     * @param inReplyToUserId The in_reply_to_user_id
     */
    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     * @return The inReplyToUserIdStr
     */
    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    /**
     * @param inReplyToUserIdStr The in_reply_to_user_id_str
     */
    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    /**
     * @return The inReplyToScreenName
     */
    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     * @param inReplyToScreenName The in_reply_to_screen_name
     */
    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     * @return The user
     */
    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    /**
     * @param user The user
     */
    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return The geo
     */
    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    /**
     * @param geo The geo
     */
    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     * @return The coordinates
     */
    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * @return The place
     */
    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    /**
     * @param place The place
     */
    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    /**
     * @return The contributors
     */
    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    /**
     * @param contributors The contributors
     */
    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    /**
     * @return The retweetedStatus
     */
    @JsonProperty("retweeted_status")
    public RetweetedStatus getRetweetedStatus() {
        return retweetedStatus;
    }

    /**
     * @param retweetedStatus The retweeted_status
     */
    @JsonProperty("retweeted_status")
    public void setRetweetedStatus(RetweetedStatus retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    /**
     * @return The retweetCount
     */
    @JsonProperty("retweet_count")
    public Long getRetweetCount() {
        return retweetCount;
    }

    /**
     * @param retweetCount The retweet_count
     */
    @JsonProperty("retweet_count")
    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    /**
     * @return The favoriteCount
     */
    @JsonProperty("favorite_count")
    public Long getFavoriteCount() {
        return favoriteCount;
    }

    /**
     * @param favoriteCount The favorite_count
     */
    @JsonProperty("favorite_count")
    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    /**
     * @return The entities
     */
    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    /**
     * @param entities The entities
     */
    @JsonProperty("entities")
    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    /**
     * @return The extendedEntities
     */
    @JsonProperty("extended_entities")
    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    /**
     * @param extendedEntities The extended_entities
     */
    @JsonProperty("extended_entities")
    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    /**
     * @return The favorited
     */
    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    /**
     * @param favorited The favorited
     */
    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    /**
     * @return The retweeted
     */
    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    /**
     * @param retweeted The retweeted
     */
    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    /**
     * @return The possiblySensitive
     */
    @JsonProperty("possibly_sensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    /**
     * @param possiblySensitive The possibly_sensitive
     */
    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    /**
     * @return The filterLevel
     */
    @JsonProperty("filter_level")
    public String getFilterLevel() {
        return filterLevel;
    }

    /**
     * @param filterLevel The filter_level
     */
    @JsonProperty("filter_level")
    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    /**
     * @return The lang
     */
    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    /**
     * @param lang The lang
     */
    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * @return The timestampMs
     */
    @JsonProperty("timestamp_ms")
    public String getTimestampMs() {
        return timestampMs;
    }

    /**
     * @param timestampMs The timestamp_ms
     */
    @JsonProperty("timestamp_ms")
    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
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
