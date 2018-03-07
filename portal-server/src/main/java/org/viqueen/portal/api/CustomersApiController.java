package org.viqueen.portal.api;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.viqueen.portal.model.Customer;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomersApiController implements CustomersApi {

    private final CustomersApi delegate;

    @Autowired
    public CustomersApiController(
            final @Qualifier("customersApi") CustomersApi delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<Void> customersCustomerIdPatch(
            @ApiParam(value = "",required=true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "" ,required=true ) @Valid @RequestBody List<String> body) {
        return delegate.customersCustomerIdPatch(customerId, body);
    }

    public ResponseEntity<Customer> getCustomerById(
            @ApiParam(value = "",required=true) @PathVariable("customerId") String customerId) {
        return delegate.getCustomerById(customerId);
    }

    public ResponseEntity<Customer> getCustomerCurrent() {
       return delegate.getCustomerCurrent();
    }

}
