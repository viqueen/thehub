package org.viqueen.portal.plugin;

import java.util.Collection;

public interface PluginDefinition {

    Collection<String> getPackages();

    Collection<Class<?>> getAPIs();

}
