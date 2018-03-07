package org.viqueen.portal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.threeten.bp.LocalDate;
import org.viqueen.portal.model.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AccountBalance> getAccountBalance(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountBalance>(objectMapper.readValue("{  \"amountBooked\" : 100.01,  \"amountAvailable\" : 100.01,  \"accountNumber\" : \"12345678901\",  \"timestamp\" : \"2018-12-31T23:59:59+01\"}", AccountBalance.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountBalance>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountBalance>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccountDetails> getAccountDetails(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccountDetails>(objectMapper.readValue("{  \"IBAN\" : \"NO9386011117947\",  \"created\" : \"2018-12-31T23:59:59+01\",  \"currency\" : \"NOK\",  \"accountInterestDetails\" : {    \"interestRate\" : 2.01,    \"accruedInterestAndFeesToDate\" : 1.01,    \"accruedInterestFromLastYear\" : 500.01,    \"earnedInterestToDate\" : 100.01,    \"feesToDate\" : 5.01  },  \"BIC\" : \"DNBANOKKXXX\",  \"updated\" : \"2018-12-31T23:59:59+01\"}", AccountDetails.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccountDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccountDetails>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> getAccountPaymentDetailsById(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber, @ApiParam(value = "",required=true) @PathVariable("paymentId") String paymentId) {
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

    public ResponseEntity<List<Payment>> getAccountPaymentsDue(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "Filter for start date (included).") @Valid @RequestParam(value = "startDate", required = false) LocalDate startDate,@ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "stopDate", required = false) String stopDate) {
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

    public ResponseEntity<Transaction> getAccountTransactionById(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber, @ApiParam(value = "",required=true) @PathVariable("transactionId") String transactionId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Transaction>(objectMapper.readValue("{  \"dateValue\" : \"2018-12-31\",  \"amount\" : 1500.0,  \"currencyValue\" : 90.0,  \"description\" : \"Lunch at The Restaurant at the End of the Universe\",  \"currency\" : \"NOK\",  \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",  \"dateBooking\" : \"2018-12-31\",  \"transactionId\" : \"12345\",  \"status\" : \"BOOKED\",  \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"}", Transaction.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Transaction>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Transaction>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> getAccountTransactions(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@ApiParam(value = "Ascending, descending") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,@ApiParam(value = "Filter for start date (included)") @Valid @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom,@ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "dateTo", required = false) LocalDate dateTo,@ApiParam(value = "Filter for minimum amount (included). No decimals.") @Valid @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum,@ApiParam(value = "Filter for maximum amount (included). No decimals.") @Valid @RequestParam(value = "amountMaximum", required = false) String amountMaximum,@ApiParam(value = "Filter for MCC. Use code only.") @Valid @RequestParam(value = "MCC", required = false) String MCC,@ApiParam(value = "Filter for free text. Case insensitive.") @Valid @RequestParam(value = "freeText", required = false) String freeText,@ApiParam(value = "Should pending transactions be included?") @Valid @RequestParam(value = "includePending", required = false) Boolean includePending) {
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

    public ResponseEntity<List<Account>> getAccountsForCurrentUser() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Account>>(objectMapper.readValue("[ {  \"accountName\" : \"Standard account\",  \"accountDetails\" : {    \"IBAN\" : \"NO9386011117947\",    \"created\" : \"2018-12-31T23:59:59+01\",    \"currency\" : \"NOK\",    \"accountInterestDetails\" : {      \"interestRate\" : 2.01,      \"accruedInterestAndFeesToDate\" : 1.01,      \"accruedInterestFromLastYear\" : 500.01,      \"earnedInterestToDate\" : 100.01,      \"feesToDate\" : 5.01    },    \"BIC\" : \"DNBANOKKXXX\",    \"updated\" : \"2018-12-31T23:59:59+01\"  },  \"balanceAvailable\" : 100.01,  \"accountNumber\" : \"12345678901\",  \"type\" : \"DEPOSIT\"}, {  \"accountName\" : \"Standard account\",  \"accountDetails\" : {    \"IBAN\" : \"NO9386011117947\",    \"created\" : \"2018-12-31T23:59:59+01\",    \"currency\" : \"NOK\",    \"accountInterestDetails\" : {      \"interestRate\" : 2.01,      \"accruedInterestAndFeesToDate\" : 1.01,      \"accruedInterestFromLastYear\" : 500.01,      \"earnedInterestToDate\" : 100.01,      \"feesToDate\" : 5.01    },    \"BIC\" : \"DNBANOKKXXX\",    \"updated\" : \"2018-12-31T23:59:59+01\"  },  \"balanceAvailable\" : 100.01,  \"accountNumber\" : \"12345678901\",  \"type\" : \"DEPOSIT\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Account>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Account>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
