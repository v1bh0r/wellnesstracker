package com.trantorinc.wellnesstracker.repository;

import com.trantorinc.wellnesstracker.model.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;
import reactor.util.annotation.NonNullApi;

import javax.validation.constraints.NotNull;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Mono<User> findByUserId(String userId);
    @NonNull Mono<User> save(@NonNull User user);
}
