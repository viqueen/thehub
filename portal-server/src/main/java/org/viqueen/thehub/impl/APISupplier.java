package org.viqueen.thehub.impl;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class APISupplier {

    private final Set<Class<?>> supportedAPIs;

    public APISupplier() {
        supportedAPIs = new HashSet<>();
    }

    @EventListener
    public void handleAPIEvent(final APIEvent event) {
        supportedAPIs.addAll(event.getSupportedAPIs());
    }

    public Set<Class<?>> getSupportedAPIs() {
        return Collections.unmodifiableSet(supportedAPIs);
    }

}
