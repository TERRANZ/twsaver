package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "small",
        "thumb",
        "medium",
        "large"
})
public class Sizes {

    @JsonProperty("small")
    private Small small;
    @JsonProperty("thumb")
    private Thumb thumb;
    @JsonProperty("medium")
    private Medium medium;
    @JsonProperty("large")
    private Large large;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The small
     */
    @JsonProperty("small")
    public Small getSmall() {
        return small;
    }

    /**
     * @param small The small
     */
    @JsonProperty("small")
    public void setSmall(Small small) {
        this.small = small;
    }

    /**
     * @return The thumb
     */
    @JsonProperty("thumb")
    public Thumb getThumb() {
        return thumb;
    }

    /**
     * @param thumb The thumb
     */
    @JsonProperty("thumb")
    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    /**
     * @return The medium
     */
    @JsonProperty("medium")
    public Medium getMedium() {
        return medium;
    }

    /**
     * @param medium The medium
     */
    @JsonProperty("medium")
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    /**
     * @return The large
     */
    @JsonProperty("large")
    public Large getLarge() {
        return large;
    }

    /**
     * @param large The large
     */
    @JsonProperty("large")
    public void setLarge(Large large) {
        this.large = large;
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
