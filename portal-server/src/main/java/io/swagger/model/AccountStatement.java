package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Monthly &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60; statement. 
 */
@ApiModel(description = "Monthly ```account``` statement. ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class AccountStatement   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("year")
  private String year = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("transactions")
  @Valid
  private List<Transaction> transactions = new ArrayList<Transaction>();

  public AccountStatement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountStatement year(String year) {
    this.year = year;
    return this;
  }

  /**
   * YYYY
   * @return year
  **/
  @ApiModelProperty(example = "1990", required = true, value = "YYYY")
  @NotNull


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public AccountStatement month(String month) {
    this.month = month;
    return this;
  }

  /**
   * MM, January: 01
   * @return month
  **/
  @ApiModelProperty(example = "01", required = true, value = "MM, January: 01")
  @NotNull

@Pattern(regexp="^\\d{2}$") @Size(min=2,max=2) 
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public AccountStatement transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public AccountStatement addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountStatement accountStatement = (AccountStatement) o;
    return Objects.equals(this.accountNumber, accountStatement.accountNumber) &&
        Objects.equals(this.year, accountStatement.year) &&
        Objects.equals(this.month, accountStatement.month) &&
        Objects.equals(this.transactions, accountStatement.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, year, month, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatement {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

