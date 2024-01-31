package com.trantorinc.wellnesstracker.repository;

import com.trantorinc.wellnesstracker.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;
import reactor.util.annotation.NonNull;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Mono<User> findByUserId(String userId);
    @NonNull Mono<User> save(@NonNull User user);
}
