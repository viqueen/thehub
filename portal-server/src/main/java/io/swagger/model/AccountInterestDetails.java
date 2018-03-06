package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details about an the interest for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Details about an the interest for an ```account```.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class AccountInterestDetails   {
  @JsonProperty("interestRate")
  private BigDecimal interestRate = null;

  @JsonProperty("earnedInterestToDate")
  private BigDecimal earnedInterestToDate = null;

  @JsonProperty("accruedInterestAndFeesToDate")
  private BigDecimal accruedInterestAndFeesToDate = null;

  @JsonProperty("feesToDate")
  private BigDecimal feesToDate = null;

  @JsonProperty("accruedInterestFromLastYear")
  private BigDecimal accruedInterestFromLastYear = null;

  public AccountInterestDetails interestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
    return this;
  }

  /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(example = "2.01", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }

  public AccountInterestDetails earnedInterestToDate(BigDecimal earnedInterestToDate) {
    this.earnedInterestToDate = earnedInterestToDate;
    return this;
  }

  /**
   * Get earnedInterestToDate
   * @return earnedInterestToDate
  **/
  @ApiModelProperty(example = "100.01", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getEarnedInterestToDate() {
    return earnedInterestToDate;
  }

  public void setEarnedInterestToDate(BigDecimal earnedInterestToDate) {
    this.earnedInterestToDate = earnedInterestToDate;
  }

  public AccountInterestDetails accruedInterestAndFeesToDate(BigDecimal accruedInterestAndFeesToDate) {
    this.accruedInterestAndFeesToDate = accruedInterestAndFeesToDate;
    return this;
  }

  /**
   * Get accruedInterestAndFeesToDate
   * @return accruedInterestAndFeesToDate
  **/
  @ApiModelProperty(example = "1.01", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getAccruedInterestAndFeesToDate() {
    return accruedInterestAndFeesToDate;
  }

  public void setAccruedInterestAndFeesToDate(BigDecimal accruedInterestAndFeesToDate) {
    this.accruedInterestAndFeesToDate = accruedInterestAndFeesToDate;
  }

  public AccountInterestDetails feesToDate(BigDecimal feesToDate) {
    this.feesToDate = feesToDate;
    return this;
  }

  /**
   * Get feesToDate
   * @return feesToDate
  **/
  @ApiModelProperty(example = "5.01", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getFeesToDate() {
    return feesToDate;
  }

  public void setFeesToDate(BigDecimal feesToDate) {
    this.feesToDate = feesToDate;
  }

  public AccountInterestDetails accruedInterestFromLastYear(BigDecimal accruedInterestFromLastYear) {
    this.accruedInterestFromLastYear = accruedInterestFromLastYear;
    return this;
  }

  /**
   * Get accruedInterestFromLastYear
   * @return accruedInterestFromLastYear
  **/
  @ApiModelProperty(example = "500.01", value = "")

  @Valid

  public BigDecimal getAccruedInterestFromLastYear() {
    return accruedInterestFromLastYear;
  }

  public void setAccruedInterestFromLastYear(BigDecimal accruedInterestFromLastYear) {
    this.accruedInterestFromLastYear = accruedInterestFromLastYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInterestDetails accountInterestDetails = (AccountInterestDetails) o;
    return Objects.equals(this.interestRate, accountInterestDetails.interestRate) &&
        Objects.equals(this.earnedInterestToDate, accountInterestDetails.earnedInterestToDate) &&
        Objects.equals(this.accruedInterestAndFeesToDate, accountInterestDetails.accruedInterestAndFeesToDate) &&
        Objects.equals(this.feesToDate, accountInterestDetails.feesToDate) &&
        Objects.equals(this.accruedInterestFromLastYear, accountInterestDetails.accruedInterestFromLastYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRate, earnedInterestToDate, accruedInterestAndFeesToDate, feesToDate, accruedInterestFromLastYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInterestDetails {\n");
    
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    earnedInterestToDate: ").append(toIndentedString(earnedInterestToDate)).append("\n");
    sb.append("    accruedInterestAndFeesToDate: ").append(toIndentedString(accruedInterestAndFeesToDate)).append("\n");
    sb.append("    feesToDate: ").append(toIndentedString(feesToDate)).append("\n");
    sb.append("    accruedInterestFromLastYear: ").append(toIndentedString(accruedInterestFromLastYear)).append("\n");
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

