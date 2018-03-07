package org.viqueen.thehub.impl;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.viqueen.portal.api.CardsApi;
import org.viqueen.portal.api.IdeasApi;
import org.viqueen.portal.api.PaymentsApi;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

@Controller
public class APIBrowserController {

    private Set<Class<?>> supportedAPIs = new HashSet<>(asList(
            CardsApi.class,
            IdeasApi.class,
            PaymentsApi.class
    ));

    @RequestMapping(value = "/api/definitions",
            produces = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<List<ApiDefinition>> getApiDefinitions() {
        final List<ApiDefinition> definitions = supportedAPIs.stream()
                .map(this::define)
                .collect(toList());

        return ResponseEntity.ok(definitions);
    }

    private <TYPE> ApiDefinition define(Class<TYPE> type) {
        final ApiDefinition.Builder builder = ApiDefinition.builder();
        final Api api = type.getAnnotation(Api.class);
        builder.name(api.value());

        stream(type.getDeclaredMethods())
                .forEach(method -> {
                    final RequestMapping mapping = method.getAnnotation(RequestMapping.class);
                    builder.endpoint(new ApiEndpoint(mapping.method()[0].name(), mapping.value()));
                });

        return builder.build();
    }
}
