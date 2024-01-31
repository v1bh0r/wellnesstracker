package com.trantorinc.wellnesstracker.service;

import com.trantorinc.wellnesstracker.mapper.UserMapper;
import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.domain.User;
import com.trantorinc.wellnesstracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Mono<com.trantorinc.wellnesstracker.model.User> createUser(NewUser user) {
        return userRepository.save(userMapper.newUserToDomain(user))
                .flatMap(createdUser -> Mono.just(userMapper.toModel(createdUser)));
    }

    public Mono<com.trantorinc.wellnesstracker.model.User> find(String userId) {
        return userRepository.findByUserId(userId)
                .flatMap(user -> Mono.just(userMapper.toModel(user)));
    }
}
