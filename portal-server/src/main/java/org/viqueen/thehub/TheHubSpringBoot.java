package org.viqueen.thehub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication(exclude=DispatcherServletAutoConfiguration.class)
@ComponentScan(basePackages = {
        "org.viqueen.thehub",
        "org.viqueen.thehub.configuration",
        "org.viqueen.thehub.impl",
        "org.viqueen.portal.dev",
        "org.viqueen.portal.impl",
        "org.viqueen.portal.api",
        "org.viqueen.portal.plugin"
})
public class TheHubSpringBoot implements CommandLineRunner {

    @Autowired
    private WebApplicationContext context;

    @Bean
    public BeanDefinitionRegistryPostProcessor theHub() {
        return new TheHubBeanDefinitionPostProcessor(context);
    }

    @Override
    public void run(String... arg0) {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

    public static void main(String[] args) {
        new SpringApplication(TheHubSpringBoot.class).run(args);
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }
    }

}
