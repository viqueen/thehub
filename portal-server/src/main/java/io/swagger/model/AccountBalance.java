package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Balances for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;. See also: &#x60;&#x60;&#x60;cardBalance&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Balances for an ```account```. See also: ```cardBalance```.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class AccountBalance   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("amountAvailable")
  private BigDecimal amountAvailable = null;

  @JsonProperty("amountBooked")
  private BigDecimal amountBooked = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public AccountBalance accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * 11 digits
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "11 digits")
  @NotNull

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountBalance amountAvailable(BigDecimal amountAvailable) {
    this.amountAvailable = amountAvailable;
    return this;
  }

  /**
   * Amount available
   * @return amountAvailable
  **/
  @ApiModelProperty(example = "100.01", required = true, value = "Amount available")
  @NotNull

  @Valid

  public BigDecimal getAmountAvailable() {
    return amountAvailable;
  }

  public void setAmountAvailable(BigDecimal amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  public AccountBalance amountBooked(BigDecimal amountBooked) {
    this.amountBooked = amountBooked;
    return this;
  }

  /**
   * Booked amount available
   * @return amountBooked
  **/
  @ApiModelProperty(example = "100.01", required = true, value = "Booked amount available")
  @NotNull

  @Valid

  public BigDecimal getAmountBooked() {
    return amountBooked;
  }

  public void setAmountBooked(BigDecimal amountBooked) {
    this.amountBooked = amountBooked;
  }

  public AccountBalance timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalance accountBalance = (AccountBalance) o;
    return Objects.equals(this.accountNumber, accountBalance.accountNumber) &&
        Objects.equals(this.amountAvailable, accountBalance.amountAvailable) &&
        Objects.equals(this.amountBooked, accountBalance.amountBooked) &&
        Objects.equals(this.timestamp, accountBalance.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amountAvailable, amountBooked, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalance {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amountAvailable: ").append(toIndentedString(amountAvailable)).append("\n");
    sb.append("    amountBooked: ").append(toIndentedString(amountBooked)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

