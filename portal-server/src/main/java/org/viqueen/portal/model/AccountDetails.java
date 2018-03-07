package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details for an &#x60;&#x60;&#x60;account&#x60;&#x60;&#x60;, with optional reference to &#x60;&#x60;&#x60;accountDetails&#x60;&#x60;&#x60;.  IBAN help: http://www.xe.com/ibancalculator/sample/?ibancountry&#x3D;norway
 */
@ApiModel(description = "Details for an ```account```, with optional reference to ```accountDetails```.  IBAN help: http://www.xe.com/ibancalculator/sample/?ibancountry=norway")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class AccountDetails   {
  @JsonProperty("IBAN")
  private String IBAN = null;

  @JsonProperty("BIC")
  private String BIC = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("updated")
  private OffsetDateTime updated = null;

  @JsonProperty("accountInterestDetails")
  private AccountInterestDetails accountInterestDetails = null;

  public AccountDetails IBAN(String IBAN) {
    this.IBAN = IBAN;
    return this;
  }

  /**
   * ISO 13616:2007: https://www.iso.org/standard/41031.html No whitespace. Enjoy the regex.
   * @return IBAN
  **/
  @ApiModelProperty(example = "NO9386011117947", required = true, value = "ISO 13616:2007: https://www.iso.org/standard/41031.html No whitespace. Enjoy the regex.")
  @NotNull

@Pattern(regexp="^((NO)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|(NO)[0-9A-Z]{13}|(BE)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|(BE)[0-9A-Z]{14}|(DK|FO|FI|GL|NL)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|(DK|FO|FI|GL|NL)[0-9A-Z]{16}|(MK|SI)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|(MK|SI)[0-9A-Z]{17}|(BA|EE|KZ|LT|LU|AT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|(BA|EE|KZ|LT|LU|AT)[0-9A-Z]{18}|(HR|LI|LV|CH)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{1}|(HR|LI|LV|CH)[0-9A-Z]{19}|(BG|DE|IE|ME|RS|GB)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|(BG|DE|IE|ME|RS|GB)[0-9A-Z]{20}|(GI|IL)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|(GI|IL)[0-9A-Z]{21}|(AD|CZ|SA|RO|SK|ES|SE|TN)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|(AD|CZ|SA|RO|SK|ES|SE|TN)[0-9A-Z]{22}|(PT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{1}|(PT)[0-9A-Z]{23}|(IS|TR)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|(IS|TR)[0-9A-Z]{24}|(FR|GR|IT|MC|SM)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|(FR|GR|IT|MC|SM)[0-9A-Z]{25}|(AL|CY|HU|LB|PL)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}|(AL|CY|HU|LB|PL)[0-9A-Z]{26}|(MU)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{2}|(MU)[0-9A-Z]{28}|(MT)[0-9A-Z]{2}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{4}[ ][0-9A-Z]{3}|(MT)[0-9A-Z]{29})$") 
  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public AccountDetails BIC(String BIC) {
    this.BIC = BIC;
    return this;
  }

  /**
   * ISO 9362: https://en.wikipedia.org/wiki/ISO_9362
   * @return BIC
  **/
  @ApiModelProperty(example = "DNBANOKKXXX", required = true, value = "ISO 9362: https://en.wikipedia.org/wiki/ISO_9362")
  @NotNull

@Pattern(regexp="^[a-z]{6}[2-9a-z][0-9a-np-z]([a-z0-9]{3}|x{3})?$") 
  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public AccountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency: ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html
   * @return currency
  **/
  @ApiModelProperty(example = "NOK", required = true, value = "Currency: ISO 4217: alpha 3-letter upcase. https://www.iso.org/iso-4217-currency-codes.html")
  @NotNull

@Size(min=2,max=2) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountDetails created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Time of account creation.
   * @return created
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01", required = true, value = "Time of account creation.")
  @NotNull

  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AccountDetails updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Time of last update.
   * @return updated
  **/
  @ApiModelProperty(example = "2018-12-31T23:59:59+01", required = true, value = "Time of last update.")
  @NotNull

  @Valid

  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public AccountDetails accountInterestDetails(AccountInterestDetails accountInterestDetails) {
    this.accountInterestDetails = accountInterestDetails;
    return this;
  }

  /**
   * Get accountInterestDetails
   * @return accountInterestDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountInterestDetails getAccountInterestDetails() {
    return accountInterestDetails;
  }

  public void setAccountInterestDetails(AccountInterestDetails accountInterestDetails) {
    this.accountInterestDetails = accountInterestDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.IBAN, accountDetails.IBAN) &&
        Objects.equals(this.BIC, accountDetails.BIC) &&
        Objects.equals(this.currency, accountDetails.currency) &&
        Objects.equals(this.created, accountDetails.created) &&
        Objects.equals(this.updated, accountDetails.updated) &&
        Objects.equals(this.accountInterestDetails, accountDetails.accountInterestDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IBAN, BIC, currency, created, updated, accountInterestDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
    sb.append("    BIC: ").append(toIndentedString(BIC)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    accountInterestDetails: ").append(toIndentedString(accountInterestDetails)).append("\n");
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

