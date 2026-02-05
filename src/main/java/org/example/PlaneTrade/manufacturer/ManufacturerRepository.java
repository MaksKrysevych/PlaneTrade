package org.example.PlaneTrade.manufacturer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ManufacturerRepository extends JpaRepository<ManufacturerEntity, Long> {

    Optional<ManufacturerEntity> findByName(String name);
}
