package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import org.threeten.bp.LocalDate;
import io.swagger.model.Transaction;
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
public class TransactionsApiController implements TransactionsApi {

    private static final Logger log = LoggerFactory.getLogger(TransactionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransactionsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Transaction>> gertTransactionForAccountById(@Pattern(regexp="`^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "",required=true) @PathVariable("transactionId") String transactionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"}, {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> gertTransactionsForAccount(@Pattern(regexp="`^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "Should reserved (unbooked) transactions be included?") @Valid @RequestParam(value = "includeReserved", required = false) Boolean includeReserved,@Size(min=3,max=4) @ApiParam(value = "Ascending, descending", allowableValues = "ASC, DESC", defaultValue = "ASC") @Valid @RequestParam(value = "sortOrder", required = false, defaultValue="ASC") String sortOrder,@ApiParam(value = "Filter for start date (included).") @Valid @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom,@ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "dateTo", required = false) LocalDate dateTo,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @Valid @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @Valid @RequestParam(value = "amountMaximum", required = false) String amountMaximum,@Pattern(regexp="^\\d{4}$") @Size(min=4,max=4) @ApiParam(value = "Filter for MCC. Use only the numeric code.") @Valid @RequestParam(value = "MCC", required = false) String MCC,@ApiParam(value = "Filter for free text. Case insensitive.") @Valid @RequestParam(value = "freeText", required = false) String freeText) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"}, {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> gertTransactionsForCard(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId,@ApiParam(value = "Ascending, descending") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "Filter for start date (included).") @Valid @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom,@ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "dateTo", required = false) LocalDate dateTo,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @Valid @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @Valid @RequestParam(value = "amountMaximum", required = false) String amountMaximum,@ApiParam(value = "Filter for MCC. Use code only.") @Valid @RequestParam(value = "MCC", required = false) String MCC,@ApiParam(value = "Filter for free text. Case insensitive.") @Valid @RequestParam(value = "freeText", required = false) String freeText,@ApiParam(value = "Should pending transactions be included?") @Valid @RequestParam(value = "includePending", required = false) Boolean includePending) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Transaction>>(objectMapper.readValue("[ {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"}, {  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Transaction>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Transaction>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
