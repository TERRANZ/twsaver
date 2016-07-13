package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "id",
        "id_str",
        "name",
        "screen_name",
        "location",
        "url",
        "description",
        "protected",
        "verified",
        "followers_count",
        "friends_count",
        "listed_count",
        "favourites_count",
        "statuses_count",
        "created_at",
        "utc_offset",
        "time_zone",
        "geo_enabled",
        "lang",
        "contributors_enabled",
        "is_translator",
        "profile_background_color",
        "profile_background_image_url",
        "profile_background_image_url_https",
        "profile_background_tile",
        "profile_link_color",
        "profile_sidebar_border_color",
        "profile_sidebar_fill_color",
        "profile_text_color",
        "profile_use_background_image",
        "profile_image_url",
        "profile_image_url_https",
        "default_profile",
        "default_profile_image",
        "following",
        "follow_request_sent",
        "notifications"
})
public class User {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("location")
    private String location;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("protected")
    private Boolean _protected;
    @JsonProperty("verified")
    private Boolean verified;
    @JsonProperty("followers_count")
    private Long followersCount;
    @JsonProperty("friends_count")
    private Long friendsCount;
    @JsonProperty("listed_count")
    private Long listedCount;
    @JsonProperty("favourites_count")
    private Long favouritesCount;
    @JsonProperty("statuses_count")
    private Long statusesCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("utc_offset")
    private Long utcOffset;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("geo_enabled")
    private Boolean geoEnabled;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("contributors_enabled")
    private Boolean contributorsEnabled;
    @JsonProperty("is_translator")
    private Boolean isTranslator;
    @JsonProperty("profile_background_color")
    private String profileBackgroundColor;
    @JsonProperty("profile_background_image_url")
    private String profileBackgroundImageUrl;
    @JsonProperty("profile_background_image_url_https")
    private String profileBackgroundImageUrlHttps;
    @JsonProperty("profile_background_tile")
    private Boolean profileBackgroundTile;
    @JsonProperty("profile_link_color")
    private String profileLinkColor;
    @JsonProperty("profile_sidebar_border_color")
    private String profileSidebarBorderColor;
    @JsonProperty("profile_sidebar_fill_color")
    private String profileSidebarFillColor;
    @JsonProperty("profile_text_color")
    private String profileTextColor;
    @JsonProperty("profile_use_background_image")
    private Boolean profileUseBackgroundImage;
    @JsonProperty("profile_image_url")
    private String profileImageUrl;
    @JsonProperty("profile_image_url_https")
    private String profileImageUrlHttps;
    @JsonProperty("default_profile")
    private Boolean defaultProfile;
    @JsonProperty("default_profile_image")
    private Boolean defaultProfileImage;
    @JsonProperty("following")
    private Object following;
    @JsonProperty("follow_request_sent")
    private Object followRequestSent;
    @JsonProperty("notifications")
    private Object notifications;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The screenName
     */
    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    /**
     * @param screenName The screen_name
     */
    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * @return The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The url
     */
    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     * @return The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The _protected
     */
    @JsonProperty("protected")
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * @param _protected The protected
     */
    @JsonProperty("protected")
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    /**
     * @return The verified
     */
    @JsonProperty("verified")
    public Boolean getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    @JsonProperty("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * @return The followersCount
     */
    @JsonProperty("followers_count")
    public Long getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount The followers_count
     */
    @JsonProperty("followers_count")
    public void setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return The friendsCount
     */
    @JsonProperty("friends_count")
    public Long getFriendsCount() {
        return friendsCount;
    }

    /**
     * @param friendsCount The friends_count
     */
    @JsonProperty("friends_count")
    public void setFriendsCount(Long friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     * @return The listedCount
     */
    @JsonProperty("listed_count")
    public Long getListedCount() {
        return listedCount;
    }

    /**
     * @param listedCount The listed_count
     */
    @JsonProperty("listed_count")
    public void setListedCount(Long listedCount) {
        this.listedCount = listedCount;
    }

    /**
     * @return The favouritesCount
     */
    @JsonProperty("favourites_count")
    public Long getFavouritesCount() {
        return favouritesCount;
    }

    /**
     * @param favouritesCount The favourites_count
     */
    @JsonProperty("favourites_count")
    public void setFavouritesCount(Long favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     * @return The statusesCount
     */
    @JsonProperty("statuses_count")
    public Long getStatusesCount() {
        return statusesCount;
    }

    /**
     * @param statusesCount The statuses_count
     */
    @JsonProperty("statuses_count")
    public void setStatusesCount(Long statusesCount) {
        this.statusesCount = statusesCount;
    }

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
     * @return The utcOffset
     */
    @JsonProperty("utc_offset")
    public Long getUtcOffset() {
        return utcOffset;
    }

    /**
     * @param utcOffset The utc_offset
     */
    @JsonProperty("utc_offset")
    public void setUtcOffset(Long utcOffset) {
        this.utcOffset = utcOffset;
    }

    /**
     * @return The timeZone
     */
    @JsonProperty("time_zone")
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone The time_zone
     */
    @JsonProperty("time_zone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return The geoEnabled
     */
    @JsonProperty("geo_enabled")
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    /**
     * @param geoEnabled The geo_enabled
     */
    @JsonProperty("geo_enabled")
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
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
     * @return The contributorsEnabled
     */
    @JsonProperty("contributors_enabled")
    public Boolean getContributorsEnabled() {
        return contributorsEnabled;
    }

    /**
     * @param contributorsEnabled The contributors_enabled
     */
    @JsonProperty("contributors_enabled")
    public void setContributorsEnabled(Boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    /**
     * @return The isTranslator
     */
    @JsonProperty("is_translator")
    public Boolean getIsTranslator() {
        return isTranslator;
    }

    /**
     * @param isTranslator The is_translator
     */
    @JsonProperty("is_translator")
    public void setIsTranslator(Boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    /**
     * @return The profileBackgroundColor
     */
    @JsonProperty("profile_background_color")
    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    /**
     * @param profileBackgroundColor The profile_background_color
     */
    @JsonProperty("profile_background_color")
    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    /**
     * @return The profileBackgroundImageUrl
     */
    @JsonProperty("profile_background_image_url")
    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    /**
     * @param profileBackgroundImageUrl The profile_background_image_url
     */
    @JsonProperty("profile_background_image_url")
    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    /**
     * @return The profileBackgroundImageUrlHttps
     */
    @JsonProperty("profile_background_image_url_https")
    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    /**
     * @param profileBackgroundImageUrlHttps The profile_background_image_url_https
     */
    @JsonProperty("profile_background_image_url_https")
    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    /**
     * @return The profileBackgroundTile
     */
    @JsonProperty("profile_background_tile")
    public Boolean getProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    /**
     * @param profileBackgroundTile The profile_background_tile
     */
    @JsonProperty("profile_background_tile")
    public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    /**
     * @return The profileLinkColor
     */
    @JsonProperty("profile_link_color")
    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    /**
     * @param profileLinkColor The profile_link_color
     */
    @JsonProperty("profile_link_color")
    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    /**
     * @return The profileSidebarBorderColor
     */
    @JsonProperty("profile_sidebar_border_color")
    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    /**
     * @param profileSidebarBorderColor The profile_sidebar_border_color
     */
    @JsonProperty("profile_sidebar_border_color")
    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    /**
     * @return The profileSidebarFillColor
     */
    @JsonProperty("profile_sidebar_fill_color")
    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    /**
     * @param profileSidebarFillColor The profile_sidebar_fill_color
     */
    @JsonProperty("profile_sidebar_fill_color")
    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    /**
     * @return The profileTextColor
     */
    @JsonProperty("profile_text_color")
    public String getProfileTextColor() {
        return profileTextColor;
    }

    /**
     * @param profileTextColor The profile_text_color
     */
    @JsonProperty("profile_text_color")
    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    /**
     * @return The profileUseBackgroundImage
     */
    @JsonProperty("profile_use_background_image")
    public Boolean getProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    /**
     * @param profileUseBackgroundImage The profile_use_background_image
     */
    @JsonProperty("profile_use_background_image")
    public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    /**
     * @return The profileImageUrl
     */
    @JsonProperty("profile_image_url")
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * @param profileImageUrl The profile_image_url
     */
    @JsonProperty("profile_image_url")
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    /**
     * @return The profileImageUrlHttps
     */
    @JsonProperty("profile_image_url_https")
    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    /**
     * @param profileImageUrlHttps The profile_image_url_https
     */
    @JsonProperty("profile_image_url_https")
    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    /**
     * @return The defaultProfile
     */
    @JsonProperty("default_profile")
    public Boolean getDefaultProfile() {
        return defaultProfile;
    }

    /**
     * @param defaultProfile The default_profile
     */
    @JsonProperty("default_profile")
    public void setDefaultProfile(Boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    /**
     * @return The defaultProfileImage
     */
    @JsonProperty("default_profile_image")
    public Boolean getDefaultProfileImage() {
        return defaultProfileImage;
    }

    /**
     * @param defaultProfileImage The default_profile_image
     */
    @JsonProperty("default_profile_image")
    public void setDefaultProfileImage(Boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    /**
     * @return The following
     */
    @JsonProperty("following")
    public Object getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    @JsonProperty("following")
    public void setFollowing(Object following) {
        this.following = following;
    }

    /**
     * @return The followRequestSent
     */
    @JsonProperty("follow_request_sent")
    public Object getFollowRequestSent() {
        return followRequestSent;
    }

    /**
     * @param followRequestSent The follow_request_sent
     */
    @JsonProperty("follow_request_sent")
    public void setFollowRequestSent(Object followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    /**
     * @return The notifications
     */
    @JsonProperty("notifications")
    public Object getNotifications() {
        return notifications;
    }

    /**
     * @param notifications The notifications
     */
    @JsonProperty("notifications")
    public void setNotifications(Object notifications) {
        this.notifications = notifications;
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
