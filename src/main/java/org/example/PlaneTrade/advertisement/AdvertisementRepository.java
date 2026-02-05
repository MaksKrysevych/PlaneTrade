package org.example.PlaneTrade.advertisement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdvertisementRepository
        extends JpaRepository<AdvertisementEntity, Long>,
        JpaSpecificationExecutor<AdvertisementEntity> {
}
