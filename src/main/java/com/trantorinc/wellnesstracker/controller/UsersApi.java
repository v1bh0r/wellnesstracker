/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.trantorinc.wellnesstracker.controller;

import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.model.User;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "users", description = "the users API")
public interface UsersApi {

    /**
     * GET /users : Get user details
     *
     * @param userId  (required)
     * @return User details (status code 200)
     */
    @Operation(
        operationId = "usersGet",
        summary = "Get user details",
        responses = {
            @ApiResponse(responseCode = "200", description = "User details", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<User>> usersGet(
        @NotNull @Parameter(name = "userId", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "userId", required = true) String userId,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"name\" : \"name\", \"userId\" : \"userId\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }


    /**
     * POST /users : Register a new user
     *
     * @param newUser  (required)
     * @return User created (status code 201)
     */
    @Operation(
        operationId = "usersPost",
        summary = "Register a new user",
        responses = {
            @ApiResponse(responseCode = "201", description = "User created")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        consumes = { "application/json" }
    )
    
    default Mono<ResponseEntity<Void>> usersPost(
        @Parameter(name = "NewUser", description = "", required = true) @Valid @RequestBody Mono<NewUser> newUser,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        return result.then(newUser).then(Mono.empty());

    }

}
