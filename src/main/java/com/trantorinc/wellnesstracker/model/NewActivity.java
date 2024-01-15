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
 * NewActivity
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
public class NewActivity {

  private String userId;

  private String date;

  private Integer steps;

  private Integer waterIntake;

  private Integer sleepHours;

  public NewActivity userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public NewActivity date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public NewActivity steps(Integer steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Get steps
   * @return steps
  */
  
  @Schema(name = "steps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(Integer steps) {
    this.steps = steps;
  }

  public NewActivity waterIntake(Integer waterIntake) {
    this.waterIntake = waterIntake;
    return this;
  }

  /**
   * Get waterIntake
   * @return waterIntake
  */
  
  @Schema(name = "waterIntake", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("waterIntake")
  public Integer getWaterIntake() {
    return waterIntake;
  }

  public void setWaterIntake(Integer waterIntake) {
    this.waterIntake = waterIntake;
  }

  public NewActivity sleepHours(Integer sleepHours) {
    this.sleepHours = sleepHours;
    return this;
  }

  /**
   * Get sleepHours
   * @return sleepHours
  */
  
  @Schema(name = "sleepHours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sleepHours")
  public Integer getSleepHours() {
    return sleepHours;
  }

  public void setSleepHours(Integer sleepHours) {
    this.sleepHours = sleepHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewActivity newActivity = (NewActivity) o;
    return Objects.equals(this.userId, newActivity.userId) &&
        Objects.equals(this.date, newActivity.date) &&
        Objects.equals(this.steps, newActivity.steps) &&
        Objects.equals(this.waterIntake, newActivity.waterIntake) &&
        Objects.equals(this.sleepHours, newActivity.sleepHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, date, steps, waterIntake, sleepHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewActivity {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    waterIntake: ").append(toIndentedString(waterIntake)).append("\n");
    sb.append("    sleepHours: ").append(toIndentedString(sleepHours)).append("\n");
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

