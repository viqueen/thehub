package org.viqueen.portal.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.viqueen.portal.api.CustomersApi;
import org.viqueen.portal.model.Customer;

import java.util.List;

@Profile("production")
@Component("customersApi")
public class CustomersApiImpl implements CustomersApi {

    @Override
    public ResponseEntity<Void> customersCustomerIdPatch(String customerId, List<String> body) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Customer> getCustomerById(String customerId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Customer> getCustomerCurrent() {
        throw new UnsupportedOperationException();
    }
}
