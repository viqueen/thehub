package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.CurrencyRate;
import io.swagger.model.Error;
import org.threeten.bp.LocalDate;
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
public class CurrenciesApiController implements CurrenciesApi {

    private static final Logger log = LoggerFactory.getLogger(CurrenciesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CurrenciesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CurrencyRate> currencyConvert(@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true) @PathVariable("base") String base,@ApiParam(value = "ISO 4217: alpha 3-letter upcase e.g EUR",required=true) @PathVariable("currency") String currency,@ApiParam(value = "",required=true) @PathVariable("amount") BigDecimal amount,@ApiParam(value = "End of day rate.") @Valid @RequestParam(value = "date", required = false) LocalDate date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<CurrencyRate>(objectMapper.readValue("{  \"currency\" : \"NOK\",  \"currencyRate\" : 123.45}", CurrencyRate.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CurrencyRate>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CurrencyRate>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<CurrencyRate>> currencyList(@Size(min=3,max=3) @ApiParam(value = "\"Home\" currency. ISO 4217: alpha 3-letter upcase",required=true) @PathVariable("base") String base,@ApiParam(value = "End of day rate.") @Valid @RequestParam(value = "date", required = false) String date) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CurrencyRate>>(objectMapper.readValue("[ {  \"currency\" : \"NOK\",  \"currencyRate\" : 123.45}, {  \"currency\" : \"NOK\",  \"currencyRate\" : 123.45} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CurrencyRate>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CurrencyRate>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
