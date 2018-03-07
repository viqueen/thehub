package org.viqueen.thehub.impl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

@SuppressWarnings("unused")
@JsonAutoDetect
class ApiEndpoint {

    @JsonProperty
    private final String key;
    @JsonProperty
    private final String method;
    @JsonProperty
    private final String[] paths;

    ApiEndpoint(String method, String[] paths) {
        this.key = UUID.randomUUID().toString();
        this.method = method;
        this.paths = paths;
    }

}
