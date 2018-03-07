package org.viqueen.portal.dev;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.threeten.bp.LocalDate;
import org.viqueen.portal.api.AccountsApi;
import org.viqueen.portal.model.*;

import java.math.BigDecimal;
import java.util.List;

@Profile("dev")
@Component("accountsApi")
public class AccountsApiMock implements AccountsApi {

    @Override
    public ResponseEntity<AccountBalance> getAccountBalance(String accountNumber) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<AccountDetails> getAccountDetails(String accountNumber) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Payment> getAccountPaymentDetailsById(String accountNumber, String paymentId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<List<Payment>> getAccountPaymentsDue(String accountNumber, LocalDate startDate, String stopDate) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<Transaction> getAccountTransactionById(String accountNumber, String transactionId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<List<Transaction>> getAccountTransactions(String accountNumber, String sortOrder, LocalDate dateFrom, LocalDate dateTo, BigDecimal amountMinimum, String amountMaximum, String MCC, String freeText, Boolean includePending) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResponseEntity<List<Account>> getAccountsForCurrentUser() {
        throw new UnsupportedOperationException();
    }
}
