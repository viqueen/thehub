package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * URIs for previous, this and next. Only this (self) is required, as previous and next may not exist).  See also global headers for pagination: &#x60;&#x60;&#x60;pageNumber&#x60;&#x60;&#x60;and &#x60;&#x60;&#x60;pageSize&#x60;&#x60;&#x60;.
 */
@ApiModel(description = "URIs for previous, this and next. Only this (self) is required, as previous and next may not exist).  See also global headers for pagination: ```pageNumber```and ```pageSize```.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class HeaderLinks   {
  @JsonProperty("first")
  private String first = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("previous")
  private String previous = null;

  @JsonProperty("next")
  private String next = null;

  public HeaderLinks first(String first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(example = "https://api.example.com/something-first", required = true, value = "")
  @NotNull


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public HeaderLinks self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(example = "https://api.example.com/something", required = true, value = "")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public HeaderLinks previous(String previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  **/
  @ApiModelProperty(example = "https://api.example.com/something-previous", value = "")


  public String getPrevious() {
    return previous;
  }

  public void setPrevious(String previous) {
    this.previous = previous;
  }

  public HeaderLinks next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(example = "https://api.example.com/something-next", value = "")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderLinks headerLinks = (HeaderLinks) o;
    return Objects.equals(this.first, headerLinks.first) &&
        Objects.equals(this.self, headerLinks.self) &&
        Objects.equals(this.previous, headerLinks.previous) &&
        Objects.equals(this.next, headerLinks.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, self, previous, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderLinks {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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

