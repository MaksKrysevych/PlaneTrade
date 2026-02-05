package org.example.PlaneTrade.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ModelRepository extends JpaRepository<ModelEntity, Long> {

    List<ModelEntity> findByManufacturerId(Long manufacturerId);
}
