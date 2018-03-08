package org.viqueen.portal.plugin;


import org.springframework.context.ApplicationEvent;

public class PluginInstalledEvent extends ApplicationEvent {

    private final PluginDefinition plugin;
    private final ClassLoader classLoader;

    public PluginInstalledEvent(final Object source, final PluginDefinition plugin, final ClassLoader classLoader) {
        super(source);
        this.plugin = plugin;
        this.classLoader = classLoader;
    }

    public PluginDefinition getPluginPackages() {
        return plugin;
    }

    public ClassLoader getClassLoader() {
        return classLoader;
    }
}
