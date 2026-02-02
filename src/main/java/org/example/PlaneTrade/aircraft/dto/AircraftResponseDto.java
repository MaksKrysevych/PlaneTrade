package org.example.PlaneTrade.aircraft.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AircraftResponseDto {

    String type;
    String manufacturer;
    String model;

    Integer year;
    Integer flightHours;
    String color;
}
