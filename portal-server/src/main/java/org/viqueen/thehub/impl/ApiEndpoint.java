package org.viqueen.thehub.impl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;
import java.util.UUID;

@SuppressWarnings("unused")
@JsonAutoDetect
class ApiEndpoint {

    @JsonProperty
    private final String key;
    @JsonProperty
    private final String method;
    @JsonProperty
    private final String path;
    @JsonProperty
    private final Set<String> parameters;

    ApiEndpoint(String method, String path, Set<String> parameters) {
        this.key = UUID.randomUUID().toString();
        this.method = method;
        this.path = path;
        this.parameters = parameters;
    }

}
