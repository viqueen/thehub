package org.viqueen.thehub;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.viqueen.thehub.impl.APIPluginDefinitionEvent;

public class TheHubBeanDefinitionPostProcessor implements BeanDefinitionRegistryPostProcessor {

    private final WebApplicationContext context;
    private ConfigurableListableBeanFactory factory;

    TheHubBeanDefinitionPostProcessor(final WebApplicationContext context) {
        this.context = context;
    }

    @Override
    public void postProcessBeanDefinitionRegistry(final BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        this.factory = configurableListableBeanFactory;
    }

    @EventListener
    public void onPluginDefinition(final APIPluginDefinitionEvent event) {
        final AnnotationConfigApplicationContext dynamicContext = new AnnotationConfigApplicationContext();
        event.getPluginDefinition()
                .getPackages()
                .forEach(dynamicContext::scan);
        dynamicContext.refresh();

        dynamicContext.getBeansWithAnnotation(Controller.class)
                .forEach((key, value) -> {
                    this.factory.registerSingleton(key, value);
                });

        context.getBeansOfType(RequestMappingHandlerMapping.class)
                .forEach((k, v) -> v.afterPropertiesSet());
    }
}
