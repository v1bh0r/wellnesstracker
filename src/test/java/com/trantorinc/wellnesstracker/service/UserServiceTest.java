package com.trantorinc.wellnesstracker.service;

import com.trantorinc.wellnesstracker.model.NewUser;
import com.trantorinc.wellnesstracker.model.User;
import com.trantorinc.wellnesstracker.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import static org.mockito.Mockito.*;

import java.util.UUID;

public class UserServiceTest {

    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {
        userRepository = mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @Test
    void createUser_ShouldCreateUserSuccessfully() {
        // Arrange
        NewUser newUser = new NewUser("John Doe", "johndoe@example.com", "HR");
        UUID userId = UUID.randomUUID();
        User expectedUser = new User(userId, newUser.getName(), newUser.getEmail(), newUser.getDepartment());

        when(userRepository.save(any(User.class))).thenReturn(Mono.just(expectedUser));

        // Act
        Mono<User> result = userService.createUser(newUser);

        // Assert
        StepVerifier.create(result)
            .expectNext(expectedUser)
            .verifyComplete();
    }

    @Test
    void find_ShouldFindUserSuccessfully() {
        // Arrange
        UUID userId = UUID.randomUUID();
        User expectedUser = new User(userId, "John Doe", "johndoe@example.com", "HR");

        when(userRepository.findByUserId(userId.toString())).thenReturn(Mono.just(expectedUser));

        // Act
        Mono<User> result = userService.find(userId.toString());

        // Assert
        StepVerifier.create(result)
            .expectNext(expectedUser)
            .verifyComplete();
    }

    @Test
    void find_ShouldReturnEmptyMonoIfUserNotFound() {
        // Arrange
        UUID userId = UUID.randomUUID();

        when(userRepository.findByUserId(userId.toString())).thenReturn(Mono.empty());

        // Act
        Mono<User> result = userService.find(userId.toString());

        // Assert
        StepVerifier.create(result)
            .verifyComplete();
    }
}
