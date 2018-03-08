package org.viqueen.portal.plugin;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class FakerSupplier {

    public Faker get(final Locale locale) {
        return Faker.instance(locale);
    }

}
