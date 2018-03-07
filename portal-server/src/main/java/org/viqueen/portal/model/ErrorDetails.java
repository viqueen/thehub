package org.viqueen.portal.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * Detailed explanation of the error. Used by &#x60;&#x60;&#x60;error&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "Detailed explanation of the error. Used by ```error```.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class ErrorDetails   {
  @JsonProperty("errorNumber")
  private String errorNumber = null;

  @JsonProperty("errorField")
  private String errorField = null;

  @JsonProperty("errorDescription")
  private String errorDescription = null;

  public ErrorDetails errorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
    return this;
  }

  /**
   * DNB's internal error number.
   * @return errorNumber
  **/
  @ApiModelProperty(example = "1234", required = true, value = "DNB's internal error number.")
  @NotNull


  public String getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(String errorNumber) {
    this.errorNumber = errorNumber;
  }

  public ErrorDetails errorField(String errorField) {
    this.errorField = errorField;
    return this;
  }

  /**
   * Name of field that caused the error.
   * @return errorField
  **/
  @ApiModelProperty(example = "firstName", value = "Name of field that caused the error.")


  public String getErrorField() {
    return errorField;
  }

  public void setErrorField(String errorField) {
    this.errorField = errorField;
  }

  public ErrorDetails errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Get errorDescription
   * @return errorDescription
  **/
  @ApiModelProperty(example = "First name cannot have non-Latin characters.", value = "")


  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.errorNumber, errorDetails.errorNumber) &&
        Objects.equals(this.errorField, errorDetails.errorField) &&
        Objects.equals(this.errorDescription, errorDetails.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorNumber, errorField, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    errorNumber: ").append(toIndentedString(errorNumber)).append("\n");
    sb.append("    errorField: ").append(toIndentedString(errorField)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

