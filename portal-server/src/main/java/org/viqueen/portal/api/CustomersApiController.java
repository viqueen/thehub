package org.viqueen.portal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.viqueen.portal.model.Customer;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class CustomersApiController implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;

    private final CustomersApi delegate;

    @Autowired
    public CustomersApiController(
            final ObjectMapper objectMapper,
            final HttpServletRequest request,
            final @Qualifier("customersApi") CustomersApi delegate) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.delegate = delegate;
    }

    public ResponseEntity<Void> customersCustomerIdPatch(
            @ApiParam(value = "",required=true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "" ,required=true ) @Valid @RequestBody List<String> body) {
        return delegate.customersCustomerIdPatch(customerId, body);
    }

    public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "",required=true) @PathVariable("customerId") String customerId) {
        return delegate.getCustomerById(customerId);
    }

    public ResponseEntity<Customer> getCustomerCurrent() {
       return delegate.getCustomerCurrent();
    }

}
