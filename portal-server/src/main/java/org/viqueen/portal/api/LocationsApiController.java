package org.viqueen.portal.api;

import org.viqueen.portal.model.ATM;
import org.viqueen.portal.model.Branch;
import org.viqueen.portal.model.OpeningTimes;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Controller
public class LocationsApiController implements LocationsApi {

    private static final Logger log = LoggerFactory.getLogger(LocationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LocationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<ATM>> findAtmByCoordinates(@ApiParam(value = "Current latitude.",required=true) @PathVariable("latitude") String latitude,@ApiParam(value = "Current longditude.",required=true) @PathVariable("longditude") String longditude) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ATM>>(objectMapper.readValue("[ {  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"id\" : \"12345\",  \"openingTimes\" : \"\",  \"currencies\" : [ \"NOK\", \"NOK\" ]}, {  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"id\" : \"12345\",  \"openingTimes\" : \"\",  \"currencies\" : [ \"NOK\", \"NOK\" ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ATM>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ATM>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Branch> findBranchByAddress(@ApiParam(value = "For now: Assume geocoding functionality similar to Google Maps: https://developers.google.com/maps/documentation/geocoding/intro") @Valid @RequestParam(value = "address", required = false) String address) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Branch>(objectMapper.readValue("{  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"}", Branch.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Branch>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Branch>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Branch> findBranchByCoordinates(@ApiParam(value = "",required=true) @PathVariable("latitude") String latitude,@ApiParam(value = "",required=true) @PathVariable("longditude") String longditude) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Branch>(objectMapper.readValue("{  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"}", Branch.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Branch>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Branch>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Branch> getBranchDetails(@ApiParam(value = "Id of branch",required=true) @PathVariable("branchid") String branchid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Branch>(objectMapper.readValue("{  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"}", Branch.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Branch>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Branch>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<OpeningTimes> getBranchOpeningTimes(@ApiParam(value = "Id of a branch",required=true) @PathVariable("branchid") String branchid) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OpeningTimes>(objectMapper.readValue("\"\"", OpeningTimes.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OpeningTimes>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OpeningTimes>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Branch>> listAtms() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Branch>>(objectMapper.readValue("[ {  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"}, {  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Branch>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Branch>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Branch>> listBranches() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Branch>>(objectMapper.readValue("[ {  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"}, {  \"branchId\" : \"branchId\",  \"phoneNumber\" : \"+4791504800\",  \"address\" : {    \"postCode\" : \"0191\",    \"postCountry\" : \"NO\",    \"postalAddressLine1\" : \"Dronning Eufemias gate 30\",    \"postCity\" : \"Oslo\",    \"postalAddressLine2\" : \"c/o CEO office\",    \"postalAddressLine3\" : \"postalAddressLine3\"  },  \"name\" : \"DNB headquarters, lobby\",  \"location\" : {    \"latitude\" : \"59.9075823\",    \"description\" : \"Lobby\",    \"id\" : \"12345\",    \"friendlyName\" : \"DNB headquarters\",    \"longditude\" : \"10.760133399999972\"  },  \"openingTimes\" : \"\",  \"email\" : \"example@example.com\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Branch>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Branch>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
