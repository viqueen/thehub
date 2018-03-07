package org.viqueen.portal.api;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.threeten.bp.LocalDate;
import org.viqueen.portal.model.*;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Controller
public class AccountsApiController implements AccountsApi {

    private final AccountsApi delegate;

    @Autowired
    public AccountsApiController(final @Qualifier("accountsApi") AccountsApi delegate) {
        this.delegate = delegate;
    }

    public ResponseEntity<AccountBalance> getAccountBalance(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber) {
        return delegate.getAccountBalance(accountNumber);
    }

    public ResponseEntity<AccountDetails> getAccountDetails(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber) {
       return delegate.getAccountDetails(accountNumber);
    }

    public ResponseEntity<Payment> getAccountPaymentDetailsById(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,
            @ApiParam(required=true) @PathVariable("paymentId") String paymentId) {
        return delegate.getAccountPaymentDetailsById(accountNumber, paymentId);
    }

    public ResponseEntity<List<Payment>> getAccountPaymentsDue(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,
            @ApiParam(value = "Filter for start date (included).") @Valid @RequestParam(value = "startDate", required = false) LocalDate startDate,
            @ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "stopDate", required = false) String stopDate) {
        return delegate.getAccountPaymentsDue(accountNumber, startDate, stopDate);
    }

    public ResponseEntity<Transaction> getAccountTransactionById(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,
            @ApiParam(required=true) @PathVariable("transactionId") String transactionId) {
        return delegate.getAccountTransactionById(accountNumber, transactionId);
    }

    public ResponseEntity<List<Transaction>> getAccountTransactions(
            @Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) @ApiParam(value = "",required=true) @PathVariable("accountNumber") String accountNumber,
            @ApiParam(value = "Ascending, descending") @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,
            @ApiParam(value = "Filter for start date (included)") @Valid @RequestParam(value = "dateFrom", required = false) LocalDate dateFrom,
            @ApiParam(value = "Filter for end date (included).") @Valid @RequestParam(value = "dateTo", required = false) LocalDate dateTo,
            @ApiParam(value = "Filter for minimum amount (included). No decimals.") @Valid @RequestParam(value = "amountMinimum", required = false) BigDecimal amountMinimum,
            @ApiParam(value = "Filter for maximum amount (included). No decimals.") @Valid @RequestParam(value = "amountMaximum", required = false) String amountMaximum,
            @ApiParam(value = "Filter for MCC. Use code only.") @Valid @RequestParam(value = "MCC", required = false) String MCC,
            @ApiParam(value = "Filter for free text. Case insensitive.") @Valid @RequestParam(value = "freeText", required = false) String freeText,
            @ApiParam(value = "Should pending transactions be included?") @Valid @RequestParam(value = "includePending", required = false) Boolean includePending) {
        return delegate.getAccountTransactions(accountNumber, sortOrder, dateFrom, dateTo, amountMinimum, amountMaximum, MCC, freeText, includePending);
    }

    public ResponseEntity<List<Account>> getAccountsForCurrentUser() {
        return delegate.getAccountsForCurrentUser();
    }

}
