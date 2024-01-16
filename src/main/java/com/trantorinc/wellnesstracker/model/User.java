package com.trantorinc.wellnesstracker.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.data.relational.core.mapping.Table;
import reactor.util.annotation.NonNull;


import java.util.*;
import javax.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("app_users")
@Data
public class User {
  @NonNull
  private UUID userId;
  @NonNull
  private String name;
  @NonNull
  private String email;
  @NonNull
  private String department;
}

