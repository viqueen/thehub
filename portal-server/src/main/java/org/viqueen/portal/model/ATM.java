package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ATM
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class ATM   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("location")
  private Location location = null;

  @JsonProperty("openingTimes")
  private OpeningTimes openingTimes = null;

  @JsonProperty("currencies")
  @Valid
  private List<String> currencies = null;

  public ATM id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "12345", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ATM name(String name) {
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

  public ATM address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public ATM location(Location location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public ATM openingTimes(OpeningTimes openingTimes) {
    this.openingTimes = openingTimes;
    return this;
  }

  /**
   * Get openingTimes
   * @return openingTimes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OpeningTimes getOpeningTimes() {
    return openingTimes;
  }

  public void setOpeningTimes(OpeningTimes openingTimes) {
    this.openingTimes = openingTimes;
  }

  public ATM currencies(List<String> currencies) {
    this.currencies = currencies;
    return this;
  }

  public ATM addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<String>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

  /**
   * Array of ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html
   * @return currencies
  **/
  @ApiModelProperty(value = "Array of ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html")


  public List<String> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ATM ATM = (ATM) o;
    return Objects.equals(this.id, ATM.id) &&
        Objects.equals(this.name, ATM.name) &&
        Objects.equals(this.address, ATM.address) &&
        Objects.equals(this.location, ATM.location) &&
        Objects.equals(this.openingTimes, ATM.openingTimes) &&
        Objects.equals(this.currencies, ATM.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, location, openingTimes, currencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ATM {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    openingTimes: ").append(toIndentedString(openingTimes)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
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

