package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Branch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class Branch   {
  @JsonProperty("branchId")
  private String branchId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("openingTimes")
  private OpeningTimes openingTimes = null;

  @JsonProperty("location")
  private Location location = null;

  public Branch branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

  /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public Branch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "DNB headquarters, lobby", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Branch phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Including \"+\" and international prefix. Whitespace is stripped.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+4791504800", required = true, value = "Including \"+\" and international prefix. Whitespace is stripped.")
  @NotNull

@Pattern(regexp="^\\+?[1-9]\\d{1,14}$") 
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Branch email(String email) {
    this.email = email;
    return this;
  }

  /**
   * RFC 5322
   * @return email
  **/
  @ApiModelProperty(example = "example@example.com", required = true, value = "RFC 5322")
  @NotNull

@Pattern(regexp="'\\A[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@ (?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\z'") 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Branch address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Branch openingTimes(OpeningTimes openingTimes) {
    this.openingTimes = openingTimes;
    return this;
  }

  /**
   * Get openingTimes
   * @return openingTimes
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OpeningTimes getOpeningTimes() {
    return openingTimes;
  }

  public void setOpeningTimes(OpeningTimes openingTimes) {
    this.openingTimes = openingTimes;
  }

  public Branch location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.branchId, branch.branchId) &&
        Objects.equals(this.name, branch.name) &&
        Objects.equals(this.phoneNumber, branch.phoneNumber) &&
        Objects.equals(this.email, branch.email) &&
        Objects.equals(this.address, branch.address) &&
        Objects.equals(this.openingTimes, branch.openingTimes) &&
        Objects.equals(this.location, branch.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branchId, name, phoneNumber, email, address, openingTimes, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    openingTimes: ").append(toIndentedString(openingTimes)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

