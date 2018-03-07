package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DepositAccountCreditLimits
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class DepositAccountCreditLimits   {
  @JsonProperty("creditLimit")
  private BigDecimal creditLimit = null;

  @JsonProperty("creditLimitExpiryDate")
  private String creditLimitExpiryDate = null;

  @JsonProperty("creditLimitInterestRate")
  private BigDecimal creditLimitInterestRate = null;

  public DepositAccountCreditLimits creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public DepositAccountCreditLimits creditLimitExpiryDate(String creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
    return this;
  }

  /**
   * Get creditLimitExpiryDate
   * @return creditLimitExpiryDate
  **/
  @ApiModelProperty(value = "")


  public String getCreditLimitExpiryDate() {
    return creditLimitExpiryDate;
  }

  public void setCreditLimitExpiryDate(String creditLimitExpiryDate) {
    this.creditLimitExpiryDate = creditLimitExpiryDate;
  }

  public DepositAccountCreditLimits creditLimitInterestRate(BigDecimal creditLimitInterestRate) {
    this.creditLimitInterestRate = creditLimitInterestRate;
    return this;
  }

  /**
   * Get creditLimitInterestRate
   * @return creditLimitInterestRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getCreditLimitInterestRate() {
    return creditLimitInterestRate;
  }

  public void setCreditLimitInterestRate(BigDecimal creditLimitInterestRate) {
    this.creditLimitInterestRate = creditLimitInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountCreditLimits depositAccountCreditLimits = (DepositAccountCreditLimits) o;
    return Objects.equals(this.creditLimit, depositAccountCreditLimits.creditLimit) &&
        Objects.equals(this.creditLimitExpiryDate, depositAccountCreditLimits.creditLimitExpiryDate) &&
        Objects.equals(this.creditLimitInterestRate, depositAccountCreditLimits.creditLimitInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditLimit, creditLimitExpiryDate, creditLimitInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountCreditLimits {\n");
    
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    creditLimitExpiryDate: ").append(toIndentedString(creditLimitExpiryDate)).append("\n");
    sb.append("    creditLimitInterestRate: ").append(toIndentedString(creditLimitInterestRate)).append("\n");
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

