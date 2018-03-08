package org.viqueen.thehub.impl;

import org.springframework.context.ApplicationEvent;
import org.viqueen.portal.plugin.PluginDefinition;

public class APIPluginDefinitionEvent extends ApplicationEvent {

    private final PluginDefinition pluginDefinition;

    APIPluginDefinitionEvent(final Object source, final PluginDefinition pluginDefinition) {
        super(source);
        this.pluginDefinition = pluginDefinition;
    }

    public PluginDefinition getPluginDefinition() {
        return pluginDefinition;
    }
}
