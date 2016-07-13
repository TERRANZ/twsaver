package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "text",
        "indices"
})
public class Hashtag {

    @JsonProperty("text")
    private String text;
    @JsonProperty("indices")
    private List<Long> indices = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
