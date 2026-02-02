package org.example.PlaneTrade.user.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class UserResponseDto {

    Long id;
    String fullName;
    String email;
    String phone;
    String role;
}
