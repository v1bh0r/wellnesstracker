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
 * Challenge
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
public class Challenge {

  private String challengeId;

  private String challengeName;

  public Challenge challengeId(String challengeId) {
    this.challengeId = challengeId;
    return this;
  }

  /**
   * Get challengeId
   * @return challengeId
  */
  
  @Schema(name = "challengeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("challengeId")
  public String getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(String challengeId) {
    this.challengeId = challengeId;
  }

  public Challenge challengeName(String challengeName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Challenge challenge = (Challenge) o;
    return Objects.equals(this.challengeId, challenge.challengeId) &&
        Objects.equals(this.challengeName, challenge.challengeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, challengeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Challenge {\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    challengeName: ").append(toIndentedString(challengeName)).append("\n");
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

