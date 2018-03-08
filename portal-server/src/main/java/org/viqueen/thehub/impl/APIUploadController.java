package org.viqueen.thehub.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.viqueen.portal.plugin.PluginDefinition;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ServiceLoader;

import static java.util.stream.StreamSupport.stream;

@Controller
public class APIUploadController {

    private final ApplicationEventPublisher eventPublisher;
    private final ApplicationContext applicationContext;

    @Autowired
    public APIUploadController(
            final ApplicationEventPublisher eventPublisher,
            final ApplicationContext applicationContext) {
        this.eventPublisher = eventPublisher;
        this.applicationContext = applicationContext;
    }

    @RequestMapping(value = "/api/upload", method = RequestMethod.POST)
    public ResponseEntity<ApiDefinition> apiUpload(@RequestParam("file") MultipartFile file) throws IOException {
        final File temp = File.createTempFile("tmp", file.getOriginalFilename());
        file.transferTo(temp);

        final URLClassLoader classLoader = new URLClassLoader(new URL[]{temp.toURI().toURL()}, APIUploadController.class.getClassLoader());
        final ServiceLoader<PluginDefinition> plugins = ServiceLoader.load(PluginDefinition.class, classLoader);

        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.setClassLoader(classLoader);
        context.setParent(applicationContext);

        stream(plugins.spliterator(), false)
                .flatMap(pluginDefinition -> pluginDefinition.getPackages().stream())
                .forEach(context::scan);

        context.refresh();

        stream(plugins.spliterator(), false)
                .map(PluginDefinition::getAPIs)
                .forEach(item -> eventPublisher.publishEvent(new APIEvent(item)));

        return ResponseEntity.ok(ApiDefinition.builder().build());
    }
}
