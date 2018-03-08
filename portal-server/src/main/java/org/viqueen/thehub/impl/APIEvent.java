package org.viqueen.thehub.impl;

import java.util.Collection;

public class APIEvent {

    private final Collection<Class<?>> supportedAPIs;

    APIEvent(final Collection<Class<?>> supportedAPIs) {
        this.supportedAPIs = supportedAPIs;
    }

    public Collection<Class<?>> getSupportedAPIs() {
        return supportedAPIs;
    }
}
