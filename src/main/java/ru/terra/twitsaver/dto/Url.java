package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "url",
        "expanded_url",
        "display_url",
        "indices"
})
public class Url {

    @JsonProperty("url")
    private String url;
    @JsonProperty("expanded_url")
    private String expandedUrl;
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The expandedUrl
     */
    @JsonProperty("expanded_url")
    public String getExpandedUrl() {
        return expandedUrl;
    }

    /**
     * @param expandedUrl The expanded_url
     */
    @JsonProperty("expanded_url")
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    /**
     * @return The displayUrl
     */
    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * @param displayUrl The display_url
     */
    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    /**
     * @return The indices
     */
    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    /**
     * @param indices The indices
     */
    @JsonProperty("indices")
    public void setIndices(List<Long> indices) {
        this.indices = indices;
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
