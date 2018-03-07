package org.viqueen.portal.api;

import org.viqueen.portal.model.Card;
import org.viqueen.portal.model.CardBalance;
import org.viqueen.portal.model.CardInvoice;
import org.viqueen.portal.model.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class CardsApiController implements CardsApi {

    private static final Logger log = LoggerFactory.getLogger(CardsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CardsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<String>> blockCard(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<String>>(objectMapper.readValue("\"ReasonCode\"", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<String>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CardBalance> cardsCardIdBalanceGet(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CardBalance>(objectMapper.readValue("{  \"amountAvailable\" : 90000.01,  \"creditLimit\" : \"100000.00\",  \"currency\" : \"NOK\",  \"amountBook\" : 90000.01,  \"timestamp\" : \"2018-12-31T23:59:59+01:00\"}", CardBalance.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CardBalance>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CardBalance>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<CardInvoice> gertCardInvoice(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId,@ApiParam(value = "YYYY",required=true) @PathVariable("year") String year,@ApiParam(value = "MM, where January is 01",required=true) @PathVariable("month") String month) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CardInvoice>(objectMapper.readValue("{  \"amount\" : 100.0,  \"month\" : \"01\",  \"year\" : \"2018\",  \"dueDate\" : \"2018-12-31\",  \"KID\" : \"42\",  \"accountNumber\" : \"12345678901\",  \"transactions\" : [ {    \"dateValue\" : \"2018-12-31\",    \"amount\" : 1500.0,    \"currencyValue\" : 90.0,    \"description\" : \"Lunch at The Restaurant at the End of the Universe\",    \"currency\" : \"NOK\",    \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",    \"dateBooking\" : \"2018-12-31\",    \"transactionId\" : \"12345\",    \"status\" : \"BOOKED\",    \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"  }, {    \"dateValue\" : \"2018-12-31\",    \"amount\" : 1500.0,    \"currencyValue\" : 90.0,    \"description\" : \"Lunch at The Restaurant at the End of the Universe\",    \"currency\" : \"NOK\",    \"MCC\" : \"3514: Hotels/Motels/Inns/Resorts\",    \"dateBooking\" : \"2018-12-31\",    \"transactionId\" : \"12345\",    \"status\" : \"BOOKED\",    \"merchantName\" : \"Coffee Shop ChainName, shop number 10\"  } ],  \"card\" : {    \"blockCode\" : \"12345\",    \"cardId\" : \"12345\",    \"debitBalance\" : {      \"amountBooked\" : 100.01,      \"amountAvailable\" : 100.01,      \"accountNumber\" : \"12345678901\",      \"timestamp\" : \"2018-12-31T23:59:59+01\"    },    \"cardType\" : \"VISA\",    \"expiryMonth\" : \"01\",    \"expiryYear\" : \"2020\",    \"accountNumber\" : \"12345678901\",    \"maskedCardNumber\" : \"XXXXXXXXXXXX1234\",    \"cardGroup\" : \"DEBIT\",    \"cardStatus\" : {      \"status\" : \"Not blocked\",      \"blockingType\" : \"Card\"    },    \"creditBalance\" : {      \"amountAvailable\" : 90000.01,      \"creditLimit\" : \"100000.00\",      \"currency\" : \"NOK\",      \"amountBook\" : 90000.01,      \"timestamp\" : \"2018-12-31T23:59:59+01:00\"    }  }}", CardInvoice.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CardInvoice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CardInvoice>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Card> getCardDetailsById(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Card>(objectMapper.readValue("{  \"blockCode\" : \"12345\",  \"cardId\" : \"12345\",  \"debitBalance\" : {    \"amountBooked\" : 100.01,    \"amountAvailable\" : 100.01,    \"accountNumber\" : \"12345678901\",    \"timestamp\" : \"2018-12-31T23:59:59+01\"  },  \"cardType\" : \"VISA\",  \"expiryMonth\" : \"01\",  \"expiryYear\" : \"2020\",  \"accountNumber\" : \"12345678901\",  \"maskedCardNumber\" : \"XXXXXXXXXXXX1234\",  \"cardGroup\" : \"DEBIT\",  \"cardStatus\" : {    \"status\" : \"Not blocked\",    \"blockingType\" : \"Card\"  },  \"creditBalance\" : {    \"amountAvailable\" : 90000.01,    \"creditLimit\" : \"100000.00\",    \"currency\" : \"NOK\",    \"amountBook\" : 90000.01,    \"timestamp\" : \"2018-12-31T23:59:59+01:00\"  }}", Card.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Card>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Card>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Transaction>> getCardTransactions(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId) {
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

    public ResponseEntity<List<Card>> getCardsForCurrentCustomer() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Card>>(objectMapper.readValue("[ {  \"blockCode\" : \"12345\",  \"cardId\" : \"12345\",  \"debitBalance\" : {    \"amountBooked\" : 100.01,    \"amountAvailable\" : 100.01,    \"accountNumber\" : \"12345678901\",    \"timestamp\" : \"2018-12-31T23:59:59+01\"  },  \"cardType\" : \"VISA\",  \"expiryMonth\" : \"01\",  \"expiryYear\" : \"2020\",  \"accountNumber\" : \"12345678901\",  \"maskedCardNumber\" : \"XXXXXXXXXXXX1234\",  \"cardGroup\" : \"DEBIT\",  \"cardStatus\" : {    \"status\" : \"Not blocked\",    \"blockingType\" : \"Card\"  },  \"creditBalance\" : {    \"amountAvailable\" : 90000.01,    \"creditLimit\" : \"100000.00\",    \"currency\" : \"NOK\",    \"amountBook\" : 90000.01,    \"timestamp\" : \"2018-12-31T23:59:59+01:00\"  }}, {  \"blockCode\" : \"12345\",  \"cardId\" : \"12345\",  \"debitBalance\" : {    \"amountBooked\" : 100.01,    \"amountAvailable\" : 100.01,    \"accountNumber\" : \"12345678901\",    \"timestamp\" : \"2018-12-31T23:59:59+01\"  },  \"cardType\" : \"VISA\",  \"expiryMonth\" : \"01\",  \"expiryYear\" : \"2020\",  \"accountNumber\" : \"12345678901\",  \"maskedCardNumber\" : \"XXXXXXXXXXXX1234\",  \"cardGroup\" : \"DEBIT\",  \"cardStatus\" : {    \"status\" : \"Not blocked\",    \"blockingType\" : \"Card\"  },  \"creditBalance\" : {    \"amountAvailable\" : 90000.01,    \"creditLimit\" : \"100000.00\",    \"currency\" : \"NOK\",    \"amountBook\" : 90000.01,    \"timestamp\" : \"2018-12-31T23:59:59+01:00\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Card>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Card>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> unblockCard(@ApiParam(value = "",required=true) @PathVariable("cardId") String cardId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
