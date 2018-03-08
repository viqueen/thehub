package org.viqueen.portal.customers.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

@ApiModel(description = "Used with ```customer```.   Work in progress. See https://shasl.restlet.io/#type_engagement")
@Validated
public class CustomerEngagement {
  @JsonProperty("engagementId")
  private String engagementId = null;

  /**
   * Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.
   */
  public enum EngagementTypeEnum {
    DEPOSIT("DEPOSIT"),
    
    CREDITCARD("CREDITCARD"),
    
    MORTGAGE("MORTGAGE");

    private String value;

    EngagementTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EngagementTypeEnum fromValue(String text) {
      for (EngagementTypeEnum b : EngagementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("engagementType")
  private EngagementTypeEnum engagementType = EngagementTypeEnum.DEPOSIT;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("friendlyName")
  private String friendlyName = null;

  @JsonProperty("corporate")
  private Boolean corporate = false;

  public CustomerEngagement engagementId(String engagementId) {
    this.engagementId = engagementId;
    return this;
  }

  /**
   * Get engagementId
   * @return engagementId
  **/
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull


  public String getEngagementId() {
    return engagementId;
  }

  public void setEngagementId(String engagementId) {
    this.engagementId = engagementId;
  }

  public CustomerEngagement engagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
    return this;
  }

  /**
   * Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.
   * @return engagementType
  **/
  @ApiModelProperty(example = "DEPOSIT", value = "Types of engagements: To be determined. Needs to be aligned with DNB CIM, without exposing internal complexity.")


  public EngagementTypeEnum getEngagementType() {
    return engagementType;
  }

  public void setEngagementType(EngagementTypeEnum engagementType) {
    this.engagementType = engagementType;
  }

  public CustomerEngagement accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(example = "12345678901", value = "")

@Pattern(regexp="^\\d{11}$") @Size(min=11,max=11) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public CustomerEngagement friendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
    return this;
  }

  /**
   * Get friendlyName
   * @return friendlyName
  **/
  @ApiModelProperty(example = "SAGA MasterCard", value = "")


  public String getFriendlyName() {
    return friendlyName;
  }

  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }

  public CustomerEngagement corporate(Boolean corporate) {
    this.corporate = corporate;
    return this;
  }

  /**
   * Get corporate
   * @return corporate
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isCorporate() {
    return corporate;
  }

  public void setCorporate(Boolean corporate) {
    this.corporate = corporate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerEngagement customerEngagement = (CustomerEngagement) o;
    return Objects.equals(this.engagementId, customerEngagement.engagementId) &&
        Objects.equals(this.engagementType, customerEngagement.engagementType) &&
        Objects.equals(this.accountNumber, customerEngagement.accountNumber) &&
        Objects.equals(this.friendlyName, customerEngagement.friendlyName) &&
        Objects.equals(this.corporate, customerEngagement.corporate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engagementId, engagementType, accountNumber, friendlyName, corporate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEngagement {\n");

    sb.append("    engagementId: ").append(toIndentedString(engagementId)).append("\n");
    sb.append("    engagementType: ").append(toIndentedString(engagementType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    corporate: ").append(toIndentedString(corporate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

