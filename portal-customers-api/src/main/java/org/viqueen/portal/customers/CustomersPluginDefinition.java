package org.viqueen.portal.customers;

import com.google.auto.service.AutoService;
import org.viqueen.portal.customers.api.CustomersApi;
import org.viqueen.portal.plugin.PluginDefinition;

import java.util.Collection;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;

@AutoService(PluginDefinition.class)
public class CustomersPluginDefinition implements PluginDefinition {

    @Override
    public Collection<String> getPackages() {
        return asList(
                "org.viqueen.portal.customers",
                "org.viqueen.portal.customers.api",
                "org.viqueen.portal.customers.dev",
                "org.viqueen.portal.customers.impl"
        );
    }

    @Override
    public Collection<Class<?>> getAPIs() {
        return singleton(CustomersApi.class);
    }
}
