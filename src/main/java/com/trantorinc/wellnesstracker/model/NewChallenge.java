package com.trantorinc.wellnesstracker.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NewChallenge
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
public class NewChallenge {

  private String challengeName;

  private String startDate;

  private String endDate;

  public NewChallenge challengeName(String challengeName) {
    this.challengeName = challengeName;
    return this;
  }

  /**
   * Get challengeName
   * @return challengeName
  */
  
  @Schema(name = "challengeName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("challengeName")
  public String getChallengeName() {
    return challengeName;
  }

  public void setChallengeName(String challengeName) {
    this.challengeName = challengeName;
  }

  public NewChallenge startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public NewChallenge endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "endDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewChallenge newChallenge = (NewChallenge) o;
    return Objects.equals(this.challengeName, newChallenge.challengeName) &&
        Objects.equals(this.startDate, newChallenge.startDate) &&
        Objects.equals(this.endDate, newChallenge.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeName, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewChallenge {\n");
    sb.append("    challengeName: ").append(toIndentedString(challengeName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

