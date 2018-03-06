package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorDetails;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The HTTP status code (&#x60;&#x60;&#x60;httpStatus&#x60;&#x60;&#x60;) is the main classifier. A DNB-specific &#x60;&#x60;&#x60;errorNumber&#x60;&#x60;&#x60;is also provided as a lookup reference.   The &#x60;&#x60;&#x60;errorDocumentation&#x60;&#x60;&#x60; is a URI to further information about the endpoint, with uesful infomration about correct usage.  The &#x60;&#x60;&#x60;errorDetails&#x60;&#x60;&#x60;is specific information about the one or more errors that have occurred.
 */
@ApiModel(description = "The HTTP status code (```httpStatus```) is the main classifier. A DNB-specific ```errorNumber```is also provided as a lookup reference.   The ```errorDocumentation``` is a URI to further information about the endpoint, with uesful infomration about correct usage.  The ```errorDetails```is specific information about the one or more errors that have occurred.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class Error   {
  @JsonProperty("httpStatus")
  private String httpStatus = null;

  @JsonProperty("errorNumber")
  private BigDecimal errorNumber = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("errorDocumentation")
  private String errorDocumentation = null;

  @JsonProperty("errorDetails")
  @Valid
  private List<ErrorDetails> errorDetails = null;

  public Error httpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  /**
   * Implicit, but still included.
   * @return httpStatus
  **/
  @ApiModelProperty(example = "400", required = true, value = "Implicit, but still included.")
  @NotNull

@Pattern(regexp="^\\d{3}$") 
  public String getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(String httpStatus) {
    this.httpStatus = httpStatus;
  }

  public Error errorNumber(BigDecimal errorNumber) {
    this.errorNumber = errorNumber;
    return this;
  }

  /**
   * DNB's error number
   * @return errorNumber
  **/
  @ApiModelProperty(example = "1234.0", required = true, value = "DNB's error number")
  @NotNull

  @Valid

  public BigDecimal getErrorNumber() {
    return errorNumber;
  }

  public void setErrorNumber(BigDecimal errorNumber) {
    this.errorNumber = errorNumber;
  }

  public Error errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Explanation
   * @return errorMessage
  **/
  @ApiModelProperty(example = "Computer says no", required = true, value = "Explanation")
  @NotNull


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Error errorDocumentation(String errorDocumentation) {
    this.errorDocumentation = errorDocumentation;
    return this;
  }

  /**
   * URI to developer documentation for this error
   * @return errorDocumentation
  **/
  @ApiModelProperty(example = "https://docs.example.com/help-for-this-endpoint/", value = "URI to developer documentation for this error")


  public String getErrorDocumentation() {
    return errorDocumentation;
  }

  public void setErrorDocumentation(String errorDocumentation) {
    this.errorDocumentation = errorDocumentation;
  }

  public Error errorDetails(List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  public Error addErrorDetailsItem(ErrorDetails errorDetailsItem) {
    if (this.errorDetails == null) {
      this.errorDetails = new ArrayList<ErrorDetails>();
    }
    this.errorDetails.add(errorDetailsItem);
    return this;
  }

  /**
   * Details about the cause of this error. Zero or more.
   * @return errorDetails
  **/
  @ApiModelProperty(value = "Details about the cause of this error. Zero or more.")

  @Valid

  public List<ErrorDetails> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(List<ErrorDetails> errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.httpStatus, error.httpStatus) &&
        Objects.equals(this.errorNumber, error.errorNumber) &&
        Objects.equals(this.errorMessage, error.errorMessage) &&
        Objects.equals(this.errorDocumentation, error.errorDocumentation) &&
        Objects.equals(this.errorDetails, error.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpStatus, errorNumber, errorMessage, errorDocumentation, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    errorNumber: ").append(toIndentedString(errorNumber)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDocumentation: ").append(toIndentedString(errorDocumentation)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

