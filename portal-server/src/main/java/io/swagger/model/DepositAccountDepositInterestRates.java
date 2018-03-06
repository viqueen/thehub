package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DepositAccountDepositInterestRatesDepositInterestRate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositAccountDepositInterestRates
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class DepositAccountDepositInterestRates   {
  @JsonProperty("interestCalculationMethod")
  private String interestCalculationMethod = null;

  @JsonProperty("overdraftInterestRate")
  private BigDecimal overdraftInterestRate = null;

  @JsonProperty("depositInterestRate")
  @Valid
  private List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate = null;

  public DepositAccountDepositInterestRates interestCalculationMethod(String interestCalculationMethod) {
    this.interestCalculationMethod = interestCalculationMethod;
    return this;
  }

  /**
   * Get interestCalculationMethod
   * @return interestCalculationMethod
  **/
  @ApiModelProperty(value = "")


  public String getInterestCalculationMethod() {
    return interestCalculationMethod;
  }

  public void setInterestCalculationMethod(String interestCalculationMethod) {
    this.interestCalculationMethod = interestCalculationMethod;
  }

  public DepositAccountDepositInterestRates overdraftInterestRate(BigDecimal overdraftInterestRate) {
    this.overdraftInterestRate = overdraftInterestRate;
    return this;
  }

  /**
   * Get overdraftInterestRate
   * @return overdraftInterestRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getOverdraftInterestRate() {
    return overdraftInterestRate;
  }

  public void setOverdraftInterestRate(BigDecimal overdraftInterestRate) {
    this.overdraftInterestRate = overdraftInterestRate;
  }

  public DepositAccountDepositInterestRates depositInterestRate(List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate) {
    this.depositInterestRate = depositInterestRate;
    return this;
  }

  public DepositAccountDepositInterestRates addDepositInterestRateItem(DepositAccountDepositInterestRatesDepositInterestRate depositInterestRateItem) {
    if (this.depositInterestRate == null) {
      this.depositInterestRate = new ArrayList<DepositAccountDepositInterestRatesDepositInterestRate>();
    }
    this.depositInterestRate.add(depositInterestRateItem);
    return this;
  }

  /**
   * Get depositInterestRate
   * @return depositInterestRate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DepositAccountDepositInterestRatesDepositInterestRate> getDepositInterestRate() {
    return depositInterestRate;
  }

  public void setDepositInterestRate(List<DepositAccountDepositInterestRatesDepositInterestRate> depositInterestRate) {
    this.depositInterestRate = depositInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountDepositInterestRates depositAccountDepositInterestRates = (DepositAccountDepositInterestRates) o;
    return Objects.equals(this.interestCalculationMethod, depositAccountDepositInterestRates.interestCalculationMethod) &&
        Objects.equals(this.overdraftInterestRate, depositAccountDepositInterestRates.overdraftInterestRate) &&
        Objects.equals(this.depositInterestRate, depositAccountDepositInterestRates.depositInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestCalculationMethod, overdraftInterestRate, depositInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountDepositInterestRates {\n");
    
    sb.append("    interestCalculationMethod: ").append(toIndentedString(interestCalculationMethod)).append("\n");
    sb.append("    overdraftInterestRate: ").append(toIndentedString(overdraftInterestRate)).append("\n");
    sb.append("    depositInterestRate: ").append(toIndentedString(depositInterestRate)).append("\n");
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

