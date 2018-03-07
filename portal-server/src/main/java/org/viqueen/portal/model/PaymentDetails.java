package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

/**
 * More details about a payment. Some payment types have more data than others.
 */
@ApiModel(description = "More details about a payment. Some payment types have more data than others.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class PaymentDetails   {
  @JsonProperty("invoiceReference")
  private String invoiceReference = null;

  public PaymentDetails invoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
    return this;
  }

  /**
   * Used for eFaktura
   * @return invoiceReference
  **/
  @ApiModelProperty(example = "12345678901", value = "Used for eFaktura")


  public String getInvoiceReference() {
    return invoiceReference;
  }

  public void setInvoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDetails paymentDetails = (PaymentDetails) o;
    return Objects.equals(this.invoiceReference, paymentDetails.invoiceReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDetails {\n");
    
    sb.append("    invoiceReference: ").append(toIndentedString(invoiceReference)).append("\n");
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

