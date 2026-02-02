package org.example.PlaneTrade.aircraft.mapper;

import org.example.PlaneTrade.aircraft.AircraftEntity;
import org.example.PlaneTrade.aircraft.dto.AircraftResponseDto;

public class AircraftMapper {

    public static AircraftResponseDto toDto(AircraftEntity aircraft) {
        return AircraftResponseDto.builder()
                .type(aircraft.getType().getName())
                .manufacturer(aircraft.getManufacturer().getName())
                .model(aircraft.getModel().getName())
                .year(aircraft.getYear())
                .flightHours(aircraft.getFlightHours())
                .color(aircraft.getColor())
                .build();
    }
}
