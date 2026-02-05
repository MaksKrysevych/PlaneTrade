package org.example.PlaneTrade.advertisement.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdvertisementFilterDto {

    private Long typeId;
    private Long manufacturerId;
    private Long modelId;

    private Integer minYear;
    private Integer maxYear;

    private Integer minFlightHours;
    private Integer maxFlightHours;

    private Integer minPrice;
    private Integer maxPrice;

    private String region;
    private String city;
}
