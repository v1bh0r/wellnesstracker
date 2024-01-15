package com.trantorinc.wellnesstracker.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ReportData
 */

@JsonTypeName("Report_data")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
public class ReportData {

  private Integer totalSteps;

  private Integer averageSleepHours;

  private Integer averageWaterIntake;

  public ReportData totalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
    return this;
  }

  /**
   * Get totalSteps
   * @return totalSteps
  */
  
  @Schema(name = "totalSteps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalSteps")
  public Integer getTotalSteps() {
    return totalSteps;
  }

  public void setTotalSteps(Integer totalSteps) {
    this.totalSteps = totalSteps;
  }

  public ReportData averageSleepHours(Integer averageSleepHours) {
    this.averageSleepHours = averageSleepHours;
    return this;
  }

  /**
   * Get averageSleepHours
   * @return averageSleepHours
  */
  
  @Schema(name = "averageSleepHours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageSleepHours")
  public Integer getAverageSleepHours() {
    return averageSleepHours;
  }

  public void setAverageSleepHours(Integer averageSleepHours) {
    this.averageSleepHours = averageSleepHours;
  }

  public ReportData averageWaterIntake(Integer averageWaterIntake) {
    this.averageWaterIntake = averageWaterIntake;
    return this;
  }

  /**
   * Get averageWaterIntake
   * @return averageWaterIntake
  */
  
  @Schema(name = "averageWaterIntake", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageWaterIntake")
  public Integer getAverageWaterIntake() {
    return averageWaterIntake;
  }

  public void setAverageWaterIntake(Integer averageWaterIntake) {
    this.averageWaterIntake = averageWaterIntake;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportData reportData = (ReportData) o;
    return Objects.equals(this.totalSteps, reportData.totalSteps) &&
        Objects.equals(this.averageSleepHours, reportData.averageSleepHours) &&
        Objects.equals(this.averageWaterIntake, reportData.averageWaterIntake);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSteps, averageSleepHours, averageWaterIntake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportData {\n");
    sb.append("    totalSteps: ").append(toIndentedString(totalSteps)).append("\n");
    sb.append("    averageSleepHours: ").append(toIndentedString(averageSleepHours)).append("\n");
    sb.append("    averageWaterIntake: ").append(toIndentedString(averageWaterIntake)).append("\n");
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

