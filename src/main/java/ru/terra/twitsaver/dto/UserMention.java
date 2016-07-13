package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "screen_name",
        "name",
        "id",
        "id_str",
        "indices"
})
public class UserMention {

    @JsonProperty("screen_name")
    private String screenName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
