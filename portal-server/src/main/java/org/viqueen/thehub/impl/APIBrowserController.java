package org.viqueen.thehub.impl;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.viqueen.portal.api.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

@Controller
public class APIBrowserController {

    // TODO : turn this into a supported api supplier, that listens to API enabled events and registers the new classes
    private Set<Class<?>> supportedAPIs = new HashSet<>(asList(
            AccountsApi.class,
            CardsApi.class,
            CurrenciesApi.class,
            CustomersApi.class,
            IdeasApi.class,
            LocationsApi.class,
            PaymentsApi.class,
            TransactionsApi.class
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
                    final Set<String> parameters = stream(method.getParameters())
                            .filter(item -> item.isAnnotationPresent(PathVariable.class))
                            .map(item -> item.getAnnotation(PathVariable.class).name())
                            .collect(toSet());
                    builder.endpoint(new ApiEndpoint(mapping.method()[0].name(), mapping.value()[0], parameters));
                });

        return builder.build();
    }
}
