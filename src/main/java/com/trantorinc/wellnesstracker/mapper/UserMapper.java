package com.trantorinc.wellnesstracker.mapper;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public com.trantorinc.wellnesstracker.model.User toModel(com.trantorinc.wellnesstracker.domain.User user) {
        return new com.trantorinc.wellnesstracker.model.User(
                user.getUserId().toString(), user.getName(), user.getEmail(), user.getEmail()
        );
    }

    public com.trantorinc.wellnesstracker.domain.User newUserToDomain(com.trantorinc.wellnesstracker.model.NewUser user) {
        return com.trantorinc.wellnesstracker.domain.User.builder()
                .userId(java.util.UUID.randomUUID())
                .name(user.getName())
                .email(user.getEmail())
                .department(user.getDepartment())
                .build();
    }
}
