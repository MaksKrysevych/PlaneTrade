package org.example.PlaneTrade.user.mapper;

import org.example.PlaneTrade.user.UserEntity;
import org.example.PlaneTrade.user.dto.UserResponseDto;

public class UserMapper {

    public static UserResponseDto toDto(UserEntity user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .phone(user.getPhone())
                .role(user.getRole().name())
                .build();
    }
}