package org.example.PlaneTrade.advertisement.mapper;

import org.example.PlaneTrade.advertisement.AdvertisementEntity;
import org.example.PlaneTrade.advertisement.dto.AdvertisementResponseDto;
import org.example.PlaneTrade.aircraft.mapper.AircraftMapper;
import org.example.PlaneTrade.user.mapper.UserMapper;

import java.util.stream.Collectors;

public class AdvertisementMapper {

    public static AdvertisementResponseDto toDto(AdvertisementEntity ad) {
        return AdvertisementResponseDto.builder()
                .id(ad.getId())
                .price(ad.getPrice())
                .status(ad.getStatus().name())
                .region(ad.getRegion())
                .city(ad.getCity())
                .description(ad.getDescription())
                .createdAt(ad.getCreatedAt())

                .owner(UserMapper.toDto(ad.getOwner()))
                .aircraft(AircraftMapper.toDto(ad.getAircraft()))

                .imageUrls(
                        ad.getGallery().stream()
                                .map(g -> g.getImagePath())
                                .collect(Collectors.toSet())
                )
                .build();
    }
}
