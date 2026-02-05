package org.example.PlaneTrade.gallery;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GalleryRepository extends JpaRepository<GalleryEntity, Long> {

    Optional<GalleryEntity> findByAdvertisementIdAndId(Long advertisementId, Long id);
}
