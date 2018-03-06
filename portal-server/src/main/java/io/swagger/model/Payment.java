package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentDetails;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * **NOTE:** May be completely merged with &#x60;&#x60;&#x60;transaction&#x60;&#x60;&#x60;.  A &#x60;&#x60;&#x60;payment&#x60;&#x60;&#x60; is a planned payment/transaction that has not yet been carried out.  Details about a payment. Used by: * /payments/due/{accountNumber}: Returning a list of payments, with _empty_ PaymentDetails * /payments/due/{accountNumber}/details: Returning a list of payments, with PaymentDetails  
 */
@ApiModel(description = "**NOTE:** May be completely merged with ```transaction```.  A ```payment``` is a planned payment/transaction that has not yet been carried out.  Details about a payment. Used by: * /payments/due/{accountNumber}: Returning a list of payments, with _empty_ PaymentDetails * /payments/due/{accountNumber}/details: Returning a list of payments, with PaymentDetails  ")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class Payment   {
  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("debitAccount")
  private String debitAccount = null;

  @JsonProperty("creditAccount")
  private String creditAccount = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("date")
  private LocalDate date = null;

  /**
   * Statuses
   */
  public enum StatusEnum {
    PAID("PAID"),
    
    PENDINGCONFIRMATION("PENDINGCONFIRMATION"),
    
    LIMITEXCEEDED("LIMITEXCEEDED"),
    
    REJECTED("REJECTED"),
    
    CONFIRMED("CONFIRMED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.PAID;

  @JsonProperty("paymentDetails")
  private PaymentDetails paymentDetails = null;

  public Payment paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(example = "123456789", required = true, value = "")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public Payment debitAccount(String debitAccount) {
    this.debitAccount = debitAccount;
    return this;
  }

  /**
   * Get debitAccount
   * @return debitAccount
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getDebitAccount() {
    return debitAccount;
  }

  public void setDebitAccount(String debitAccount) {
    this.debitAccount = debitAccount;
  }

  public Payment creditAccount(String creditAccount) {
    this.creditAccount = creditAccount;
    return this;
  }

  /**
   * Get creditAccount
   * @return creditAccount
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "")
  @NotNull

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getCreditAccount() {
    return creditAccount;
  }

  public void setCreditAccount(String creditAccount) {
    this.creditAccount = creditAccount;
  }

  public Payment amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "1500.01", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Payment type(String type) {
    this.type = type;
    return this;
  }

  /**
   * TBD
   * @return type
  **/
  @ApiModelProperty(example = "TBD1", required = true, value = "TBD")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Payment date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "2018-31-12", value = "")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Payment status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Statuses
   * @return status
  **/
  @ApiModelProperty(example = "PAID", required = true, value = "Statuses")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Payment paymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

  /**
   * Get paymentDetails
   * @return paymentDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.paymentId, payment.paymentId) &&
        Objects.equals(this.debitAccount, payment.debitAccount) &&
        Objects.equals(this.creditAccount, payment.creditAccount) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.type, payment.type) &&
        Objects.equals(this.date, payment.date) &&
        Objects.equals(this.status, payment.status) &&
        Objects.equals(this.paymentDetails, payment.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, debitAccount, creditAccount, amount, type, date, status, paymentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    debitAccount: ").append(toIndentedString(debitAccount)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
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

