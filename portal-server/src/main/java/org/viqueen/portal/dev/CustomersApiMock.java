package org.viqueen.portal.dev;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.viqueen.portal.api.CustomersApi;
import org.viqueen.portal.model.Customer;

import java.util.List;

@Profile("dev")
@Component("customersApi")
public class CustomersApiMock implements CustomersApi {

    private final Faker faker;

    @Autowired
    public CustomersApiMock() {
        faker = new Faker();
    }

    @Override
    public ResponseEntity<Void> customersCustomerIdPatch(String customerId, List<String> body) {
        return null;
    }

    @Override
    public ResponseEntity<Customer> getCustomerById(String customerId) {
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
