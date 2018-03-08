package org.viqueen.portal.customers.dev;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.viqueen.portal.customers.api.CustomersApi;
import org.viqueen.portal.customers.model.Customer;
import org.viqueen.portal.plugin.FakerSupplier;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

import static org.apache.commons.lang3.StringUtils.isEmpty;

@Profile("dev")
@Component("customersApi")
public class CustomersApiMock implements CustomersApi {

    private final FakerSupplier fakerSupplier;
    private final HttpServletRequest request;

    @Autowired
    public CustomersApiMock(
            final FakerSupplier fakerSupplier,
            @Lazy final HttpServletRequest request) {
        this.fakerSupplier = fakerSupplier;
        this.request = request;
    }

    @Override
    public ResponseEntity<Void> customersCustomerIdPatch(String customerId, List<String> body) {
        return null;
    }

    @Override
    public ResponseEntity<Customer> getCustomerById(String customerId) {
        // hax
        final Locale locale = request.getLocale();
        final Locale resolvedLocale;
        if (isEmpty(locale.getCountry()) && locale.getLanguage().matches("nb|no")) {
            // faker does not know how to resolve locales without a country defined
            // while I fix that (open-source PR), I am applying this workaround for Norsk
            resolvedLocale = Locale.forLanguageTag("nb-NO");
        } else {
            resolvedLocale = request.getLocale();
        }

        final Faker faker = fakerSupplier.get(resolvedLocale);
        final Customer customer = new Customer();

        customer.customerId(customerId);
        customer.companyName(faker.company().name());
        customer.countryOfBirth(faker.address().country());
        customer.customerType(Customer.CustomerTypeEnum.PERSON);
        customer.firstName(faker.name().firstName());
        customer.lastName(faker.name().lastName());

        return ResponseEntity.ok(customer);
    }

    @Override
    public ResponseEntity<Customer> getCustomerCurrent() {
        return null;
    }
}
