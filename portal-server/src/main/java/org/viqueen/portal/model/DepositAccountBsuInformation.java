package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * DepositAccountBsuInformation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class DepositAccountBsuInformation   {
  @JsonProperty("bsuStatus")
  private String bsuStatus = null;

  @JsonProperty("frozenInterestAmount")
  private BigDecimal frozenInterestAmount = null;

  @JsonProperty("frozenSavedAmount")
  private BigDecimal frozenSavedAmount = null;

  @JsonProperty("savedAmountThisYear")
  private BigDecimal savedAmountThisYear = null;

  public DepositAccountBsuInformation bsuStatus(String bsuStatus) {
    this.bsuStatus = bsuStatus;
    return this;
  }

  /**
   * Get bsuStatus
   * @return bsuStatus
  **/
  @ApiModelProperty(value = "")


  public String getBsuStatus() {
    return bsuStatus;
  }

  public void setBsuStatus(String bsuStatus) {
    this.bsuStatus = bsuStatus;
  }

  public DepositAccountBsuInformation frozenInterestAmount(BigDecimal frozenInterestAmount) {
    this.frozenInterestAmount = frozenInterestAmount;
    return this;
  }

  /**
   * Get frozenInterestAmount
   * @return frozenInterestAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFrozenInterestAmount() {
    return frozenInterestAmount;
  }

  public void setFrozenInterestAmount(BigDecimal frozenInterestAmount) {
    this.frozenInterestAmount = frozenInterestAmount;
  }

  public DepositAccountBsuInformation frozenSavedAmount(BigDecimal frozenSavedAmount) {
    this.frozenSavedAmount = frozenSavedAmount;
    return this;
  }

  /**
   * Get frozenSavedAmount
   * @return frozenSavedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getFrozenSavedAmount() {
    return frozenSavedAmount;
  }

  public void setFrozenSavedAmount(BigDecimal frozenSavedAmount) {
    this.frozenSavedAmount = frozenSavedAmount;
  }

  public DepositAccountBsuInformation savedAmountThisYear(BigDecimal savedAmountThisYear) {
    this.savedAmountThisYear = savedAmountThisYear;
    return this;
  }

  /**
   * Get savedAmountThisYear
   * @return savedAmountThisYear
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSavedAmountThisYear() {
    return savedAmountThisYear;
  }

  public void setSavedAmountThisYear(BigDecimal savedAmountThisYear) {
    this.savedAmountThisYear = savedAmountThisYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountBsuInformation depositAccountBsuInformation = (DepositAccountBsuInformation) o;
    return Objects.equals(this.bsuStatus, depositAccountBsuInformation.bsuStatus) &&
        Objects.equals(this.frozenInterestAmount, depositAccountBsuInformation.frozenInterestAmount) &&
        Objects.equals(this.frozenSavedAmount, depositAccountBsuInformation.frozenSavedAmount) &&
        Objects.equals(this.savedAmountThisYear, depositAccountBsuInformation.savedAmountThisYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bsuStatus, frozenInterestAmount, frozenSavedAmount, savedAmountThisYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountBsuInformation {\n");
    
    sb.append("    bsuStatus: ").append(toIndentedString(bsuStatus)).append("\n");
    sb.append("    frozenInterestAmount: ").append(toIndentedString(frozenInterestAmount)).append("\n");
    sb.append("    frozenSavedAmount: ").append(toIndentedString(frozenSavedAmount)).append("\n");
    sb.append("    savedAmountThisYear: ").append(toIndentedString(savedAmountThisYear)).append("\n");
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

