package org.viqueen.thehub.impl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class ApiEndpoint {

    @JsonProperty
    private final String method;
    @JsonProperty
    private final String[] paths;

    public ApiEndpoint(String method, String[] paths) {
        this.method = method;
        this.paths = paths;
    }

}
