package ru.terra.twitsaver.dto;

import org.codehaus.jackson.annotate.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "w",
        "h",
        "resize"
})
public class Large {

    @JsonProperty("w")
    private Long w;
    @JsonProperty("h")
    private Long h;
    @JsonProperty("resize")
    private String resize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The w
     */
    @JsonProperty("w")
    public Long getW() {
        return w;
    }

    /**
     * @param w The w
     */
    @JsonProperty("w")
    public void setW(Long w) {
        this.w = w;
    }

    /**
     * @return The h
     */
    @JsonProperty("h")
    public Long getH() {
        return h;
    }

    /**
     * @param h The h
     */
    @JsonProperty("h")
    public void setH(Long h) {
        this.h = h;
    }

    /**
     * @return The resize
     */
    @JsonProperty("resize")
    public String getResize() {
        return resize;
    }

    /**
     * @param resize The resize
     */
    @JsonProperty("resize")
    public void setResize(String resize) {
        this.resize = resize;
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
