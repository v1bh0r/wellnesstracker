package com.trantorinc.wellnesstracker.api;

import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.model.User;
import com.trantorinc.wellnesstracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class UsersApiDelegateImpl implements UsersApiDelegate {
    private final UserService userService;

    @Override
    public Mono<ResponseEntity<User>> usersGet(String userId,
                                               ServerWebExchange exchange) {
        return userService.find(userId)
                .map(ResponseEntity::ok)
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @Override
    public Mono<ResponseEntity<User>> usersPost(Mono<NewUser> newUserStream, ServerWebExchange exchange) {
        return newUserStream.flatMap(newUser -> userService.createUser(newUser)
                .map(ResponseEntity::ok)
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build())));
    }
}
