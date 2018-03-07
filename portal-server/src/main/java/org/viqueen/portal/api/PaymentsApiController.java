package org.viqueen.portal.api;

import java.util.List;

import org.viqueen.portal.model.PaymentInitiation;
import org.threeten.bp.LocalDate;
import org.viqueen.portal.model.Payment;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class PaymentsApiController implements PaymentsApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> deletePayment(@ApiParam(value = "",required=true) @PathVariable("paymentId") String paymentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> getPaymentDueById(@ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "",required=true) @PathVariable("paymentId") String paymentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{  \"date\" : \"2018-31-12\",  \"amount\" : 1500.01,  \"debitAccount\" : \"12345678901\",  \"creditAccount\" : \"12345678901\",  \"paymentId\" : \"123456789\",  \"type\" : \"TBD1\",  \"paymentDetails\" : {    \"invoiceReference\" : \"12345678901\"  },  \"status\" : \"PAID\"}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Payment>> getPaymentsDue(@ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "Filter for start date (included).") @Valid @RequestParam(value = "startDate", required = false) LocalDate startDate,@ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "stopDate", required = false) LocalDate stopDate) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Payment>>(objectMapper.readValue("[ {  \"date\" : \"2018-31-12\",  \"amount\" : 1500.01,  \"debitAccount\" : \"12345678901\",  \"creditAccount\" : \"12345678901\",  \"paymentId\" : \"123456789\",  \"type\" : \"TBD1\",  \"paymentDetails\" : {    \"invoiceReference\" : \"12345678901\"  },  \"status\" : \"PAID\"}, {  \"date\" : \"2018-31-12\",  \"amount\" : 1500.01,  \"debitAccount\" : \"12345678901\",  \"creditAccount\" : \"12345678901\",  \"paymentId\" : \"123456789\",  \"type\" : \"TBD1\",  \"paymentDetails\" : {    \"invoiceReference\" : \"12345678901\"  },  \"status\" : \"PAID\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Payment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Payment>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> paymentInitiate(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentInitiation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<String>(objectMapper.readValue("\"1234567890\"", String.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> updatePayment(@ApiParam(value = "",required=true) @PathVariable("paymentId") String paymentId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody List<String> body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{  \"date\" : \"2018-31-12\",  \"amount\" : 1500.01,  \"debitAccount\" : \"12345678901\",  \"creditAccount\" : \"12345678901\",  \"paymentId\" : \"123456789\",  \"type\" : \"TBD1\",  \"paymentDetails\" : {    \"invoiceReference\" : \"12345678901\"  },  \"status\" : \"PAID\"}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

}
