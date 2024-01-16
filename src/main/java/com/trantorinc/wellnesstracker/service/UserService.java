package com.trantorinc.wellnesstracker.service;

import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.model.User;
import com.trantorinc.wellnesstracker.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Mono<User> createUser(NewUser user) {
        return userRepository.save(User.builder()
                .userId(UUID.randomUUID())
                .name(user.getName())
                .email(user.getEmail())
                .department(user.getDepartment())
                .build());
    }

    public Mono<User> find(String userId) {
        return userRepository.findByUserId(userId);
    }
}
