package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used by &#x60;&#x60;&#x60;card&#x60;&#x60;&#x60;. See also: &#x60;&#x60;&#x60;accountBalance&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Used by ```card```. See also: ```accountBalance```.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class CardBalance   {
  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("creditLimit")
  private Integer creditLimit = null;

  @JsonProperty("amountAvailable")
  private BigDecimal amountAvailable = null;

  @JsonProperty("amountBook")
  private BigDecimal amountBook = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public CardBalance currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * ISO 4217: alpha 3-letter upcase: https://www.iso.org/iso-4217-currency-codes.html
   * @return currency
  **/
  @ApiModelProperty(example = "NOK", required = true, value = "ISO 4217: alpha 3-letter upcase: https://www.iso.org/iso-4217-currency-codes.html")
  @NotNull

@Size(min=3,max=3) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CardBalance creditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * minimum: 0
   * @return creditLimit
  **/
  @ApiModelProperty(example = "100000.00", value = "")

@Min(0)
  public Integer getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Integer creditLimit) {
    this.creditLimit = creditLimit;
  }

  public CardBalance amountAvailable(BigDecimal amountAvailable) {
    this.amountAvailable = amountAvailable;
    return this;
  }

  /**
   * Debit: The amount in the ```account```.Credit: The limit minus the registered payments.
   * @return amountAvailable
  **/
  @ApiModelProperty(example = "90000.01", required = true, value = "Debit: The amount in the ```account```.Credit: The limit minus the registered payments.")
  @NotNull

  @Valid

  public BigDecimal getAmountAvailable() {
    return amountAvailable;
  }

  public void setAmountAvailable(BigDecimal amountAvailable) {
    this.amountAvailable = amountAvailable;
  }

  public CardBalance amountBook(BigDecimal amountBook) {
    this.amountBook = amountBook;
    return this;
  }

  /**
   * Get amountBook
   * @return amountBook
  **/
  @ApiModelProperty(example = "90000.01", value = "")

  @Valid

  public BigDecimal getAmountBook() {
    return amountBook;
  }

  public void setAmountBook(BigDecimal amountBook) {
    this.amountBook = amountBook;
  }

  public CardBalance timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01:00", value = "")

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
    CardBalance cardBalance = (CardBalance) o;
    return Objects.equals(this.currency, cardBalance.currency) &&
        Objects.equals(this.creditLimit, cardBalance.creditLimit) &&
        Objects.equals(this.amountAvailable, cardBalance.amountAvailable) &&
        Objects.equals(this.amountBook, cardBalance.amountBook) &&
        Objects.equals(this.timestamp, cardBalance.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, creditLimit, amountAvailable, amountBook, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardBalance {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    amountAvailable: ").append(toIndentedString(amountAvailable)).append("\n");
    sb.append("    amountBook: ").append(toIndentedString(amountBook)).append("\n");
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

