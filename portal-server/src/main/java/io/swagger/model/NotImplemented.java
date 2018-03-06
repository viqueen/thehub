package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Error;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Standard response for operations that are not yet implemented.
 */
@ApiModel(description = "Standard response for operations that are not yet implemented.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class NotImplemented   {
  @JsonProperty("explanation")
  private String explanation = "Feedback is very welcome: developer@dnb.no";

  @JsonProperty("error")
  private Error error = null;

  public NotImplemented explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Text describing that this operation is not yet implemented.
   * @return explanation
  **/
  @ApiModelProperty(value = "Text describing that this operation is not yet implemented.")


  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public NotImplemented error(Error error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotImplemented notImplemented = (NotImplemented) o;
    return Objects.equals(this.explanation, notImplemented.explanation) &&
        Objects.equals(this.error, notImplemented.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explanation, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotImplemented {\n");
    
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

