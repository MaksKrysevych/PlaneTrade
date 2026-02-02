package org.example.PlaneTrade.advertisement.dto;

import lombok.Builder;
import lombok.Value;
import org.example.PlaneTrade.aircraft.dto.AircraftResponseDto;
import org.example.PlaneTrade.user.dto.UserResponseDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Value
@Builder
public class AdvertisementResponseDto {

    Long id;

    BigDecimal price;
    String status;
    String region;
    String city;
    String description;
    LocalDateTime createdAt;

    UserResponseDto owner;
    AircraftResponseDto aircraft;

    Set<String> imageUrls;
}

