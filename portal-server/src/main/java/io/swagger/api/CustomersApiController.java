package io.swagger.api;

import io.swagger.model.Customer;
import io.swagger.model.Error;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class CustomersApiController implements CustomersApi {

    private static final Logger log = LoggerFactory.getLogger(CustomersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> customersCustomerIdPatch(@ApiParam(value = "",required=true) @PathVariable("customerId") String customerId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<String> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerById(@ApiParam(value = "",required=true) @PathVariable("customerId") String customerId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"firstName\" : \"Rune\",  \"lastName\" : \"Bjerke\",  \"customerType\" : \"PERSON\",  \"customerEngagement\" : [ {    \"corporate\" : true,    \"engagementType\" : \"DEPOSIT\",    \"accountNumber\" : \"12345678901\",    \"engagementId\" : \"12345\",    \"friendlyName\" : \"SAGA MasterCard\"  }, {    \"corporate\" : true,    \"engagementType\" : \"DEPOSIT\",    \"accountNumber\" : \"12345678901\",    \"engagementId\" : \"12345\",    \"friendlyName\" : \"SAGA MasterCard\"  } ],  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"countryCitizenships\" : [ \"NO\", \"NO\" ],  \"phone\" : \"+4791504800\",  \"countryOfBirth\" : \"NO\",  \"companyName\" : \"DNB\",  \"customerId\" : \"12345678901\",  \"email\" : \"example@example.com\",  \"countryTax\" : [ \"NO\", \"NO\" ]}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Customer> getCustomerCurrent() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Customer>(objectMapper.readValue("{  \"firstName\" : \"Rune\",  \"lastName\" : \"Bjerke\",  \"customerType\" : \"PERSON\",  \"customerEngagement\" : [ {    \"corporate\" : true,    \"engagementType\" : \"DEPOSIT\",    \"accountNumber\" : \"12345678901\",    \"engagementId\" : \"12345\",    \"friendlyName\" : \"SAGA MasterCard\"  }, {    \"corporate\" : true,    \"engagementType\" : \"DEPOSIT\",    \"accountNumber\" : \"12345678901\",    \"engagementId\" : \"12345\",    \"friendlyName\" : \"SAGA MasterCard\"  } ],  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"countryCitizenships\" : [ \"NO\", \"NO\" ],  \"phone\" : \"+4791504800\",  \"countryOfBirth\" : \"NO\",  \"companyName\" : \"DNB\",  \"customerId\" : \"12345678901\",  \"email\" : \"example@example.com\",  \"countryTax\" : [ \"NO\", \"NO\" ]}", Customer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Customer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Customer>(HttpStatus.NOT_IMPLEMENTED);
    }

}
