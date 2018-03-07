package org.viqueen.thehub.impl;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

@JsonAutoDetect
public class ApiDefinition {

    @JsonProperty
    private final String name;
    @JsonProperty
    private final String description;
    @JsonProperty
    private final List<ApiEndpoint> endpoints;

    private ApiDefinition(
            final String name,
            final String description,
            final List<ApiEndpoint> endpoints) {
        this.name = name;
        this.description = description;
        this.endpoints = endpoints;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<ApiEndpoint> getEndpoints() {
        return unmodifiableList(endpoints);
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private String description;
        private List<ApiEndpoint> endpoints = new ArrayList<>();

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder description(final String description) {
            this.description = description;
            return this;
        }

        public Builder endpoint(final ApiEndpoint endpoint) {
            this.endpoints.add(endpoint);
            return this;
        }

        public ApiDefinition build() {
            return new ApiDefinition(name, description, endpoints);
        }
    }
}
