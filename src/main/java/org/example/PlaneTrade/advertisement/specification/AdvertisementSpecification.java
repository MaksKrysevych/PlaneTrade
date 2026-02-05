package org.example.PlaneTrade.advertisement.specification;

import org.example.PlaneTrade.advertisement.AdvertisementEntity;
import org.example.PlaneTrade.advertisement.dto.AdvertisementFilterDto;
import org.springframework.data.jpa.domain.Specification;

import jakarta.persistence.criteria.Join;

public class AdvertisementSpecification {

    public static Specification<AdvertisementEntity> withFilter(AdvertisementFilterDto filter) {
        return (root, query, cb) -> {

            var predicates = cb.conjunction();

            Join<Object, Object> aircraft = root.join("aircraft");

            if (filter.getTypeId() != null) {
                predicates.getExpressions().add(
                        cb.equal(aircraft.get("type").get("id"), filter.getTypeId())
                );
            }

            if (filter.getManufacturerId() != null) {
                predicates.getExpressions().add(
                        cb.equal(aircraft.get("manufacturer").get("id"), filter.getManufacturerId())
                );
            }

            if (filter.getModelId() != null) {
                predicates.getExpressions().add(
                        cb.equal(aircraft.get("model").get("id"), filter.getModelId())
                );
            }

            if (filter.getMinYear() != null) {
                predicates.getExpressions().add(
                        cb.greaterThanOrEqualTo(aircraft.get("year"), filter.getMinYear())
                );
            }

            if (filter.getMaxYear() != null) {
                predicates.getExpressions().add(
                        cb.lessThanOrEqualTo(aircraft.get("year"), filter.getMaxYear())
                );
            }

            if (filter.getMinFlightHours() != null) {
                predicates.getExpressions().add(
                        cb.greaterThanOrEqualTo(aircraft.get("flightHours"), filter.getMinFlightHours())
                );
            }

            if (filter.getMaxFlightHours() != null) {
                predicates.getExpressions().add(
                        cb.lessThanOrEqualTo(aircraft.get("flightHours"), filter.getMaxFlightHours())
                );
            }

            if (filter.getMinPrice() != null) {
                predicates.getExpressions().add(
                        cb.greaterThanOrEqualTo(root.get("price"), filter.getMinPrice())
                );
            }

            if (filter.getMaxPrice() != null) {
                predicates.getExpressions().add(
                        cb.lessThanOrEqualTo(root.get("price"), filter.getMaxPrice())
                );
            }

            if (filter.getRegion() != null && !filter.getRegion().isBlank()) {
                predicates.getExpressions().add(
                        cb.equal(root.get("region"), filter.getRegion())
                );
            }

            if (filter.getCity() != null && !filter.getCity().isBlank()) {
                predicates.getExpressions().add(
                        cb.equal(root.get("city"), filter.getCity())
                );
            }

            return predicates;
        };
    }
}
