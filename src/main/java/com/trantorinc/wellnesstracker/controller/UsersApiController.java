package com.trantorinc.wellnesstracker.controller;

import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.model.User;


import com.trantorinc.wellnesstracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T17:46:27.736648+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("${openapi.employeeWellnessTracker.base-path:}")
@RequiredArgsConstructor
public class UsersApiController implements UsersApi {
    private final UserRepository userRepository;
    @Override
    public Mono<ResponseEntity<User>> usersGet(String userId, ServerWebExchange exchange) {
        return userRepository.findByUserId(userId)
                .map(user -> ResponseEntity.ok(user))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @Override
    public Mono<ResponseEntity<Void>> usersPost(Mono<NewUser> newUser, ServerWebExchange exchange) {
        return newUser.flatMap(providedUser -> {
            var user = User.builder()
                .userId(UUID.randomUUID())
                .name(providedUser.getName())
                .build();
            return userRepository.save(user)
                .map(createdUser -> ResponseEntity.status(HttpStatus.CREATED).build());
        });
    }
}
