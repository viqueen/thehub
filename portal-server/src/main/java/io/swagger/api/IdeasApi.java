/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.NotImplemented;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

@Api(value = "ideas", description = "the ideas API")
public interface IdeasApi {

    @ApiOperation(value = "Get IBAN for DNB account", nickname = "getIbanForAccount", notes = "**DRAFT:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no", response = String.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Bad accountNumber", response = Error.class),
        @ApiResponse(code = 404, message = "Not a DNB accountNumber", response = Error.class) })
    @RequestMapping(value = "/ideas/accounts/iban/{accountNumber}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<String> getIbanForAccount(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber);


    @ApiOperation(value = "Verify that account belongs to a customer", nickname = "verifyAccount", notes = "**DRAFT IDEA:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no ", authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200"),
        @ApiResponse(code = 400, message = "Status 400", response = Error.class),
        @ApiResponse(code = 404, message = "No match", response = Error.class),
        @ApiResponse(code = 501, message = "Status 501", response = NotImplemented.class) })
    @RequestMapping(value = "/ideas/accounts/verify/{accountNumber}/{customerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> verifyAccount(@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,@Pattern(regexp="^\\d{9,11}$") @Size(min=9,max=11) @ApiParam(value = "SSN or Organization number",required=true) @PathVariable("customerId") String customerId);


    @ApiOperation(value = "Verify IBAN format", nickname = "verifyIbanFormat", notes = "**DRAFT IDEA:** This endpoint is not part of the initial release. Input appreciated: developer@dnb.no", response = String.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "read", description = "Read"),
            @AuthorizationScope(scope = "write", description = "Write")
            })
    }, tags={ "Accounts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Status 200", response = String.class),
        @ApiResponse(code = 400, message = "Bad accountNumber", response = Error.class),
        @ApiResponse(code = 404, message = "Not a DNB accountNumber", response = Error.class) })
    @RequestMapping(value = "/ideas/accounts/ibanverify/{IBAN}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<String> verifyIbanFormat(@ApiParam(value = "",required=true) @PathVariable("IBAN") String IBAN);

}
