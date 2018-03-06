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
 * OpeningTimesInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-06T17:32:28.136+01:00")

public class OpeningTimesInner   {
  @JsonProperty("day")
  private Integer day = null;

  @JsonProperty("openingTime")
  private String openingTime = null;

  @JsonProperty("closingTime")
  private String closingTime = null;

  public OpeningTimesInner day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * 1: Monday, 2: Tuesday, etc
   * minimum: 1
   * maximum: 7
   * @return day
  **/
  @ApiModelProperty(example = "1", value = "1: Monday, 2: Tuesday, etc")

@Min(1) @Max(7) 
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public OpeningTimesInner openingTime(String openingTime) {
    this.openingTime = openingTime;
    return this;
  }

  /**
   * HH:MM
   * @return openingTime
  **/
  @ApiModelProperty(example = "09:00", required = true, value = "HH:MM")
  @NotNull

@Pattern(regexp="^\\d{2}:\\d{2}$") 
  public String getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(String openingTime) {
    this.openingTime = openingTime;
  }

  public OpeningTimesInner closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * HH:MM
   * @return closingTime
  **/
  @ApiModelProperty(example = "16:00", required = true, value = "HH:MM")
  @NotNull

@Pattern(regexp="^\\d{2}:\\d{2}$") 
  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpeningTimesInner openingTimesInner = (OpeningTimesInner) o;
    return Objects.equals(this.day, openingTimesInner.day) &&
        Objects.equals(this.openingTime, openingTimesInner.openingTime) &&
        Objects.equals(this.closingTime, openingTimesInner.closingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, openingTime, closingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpeningTimesInner {\n");
    
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
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

