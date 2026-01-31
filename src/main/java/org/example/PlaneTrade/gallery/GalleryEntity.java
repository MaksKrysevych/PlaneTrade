package org.example.PlaneTrade.gallery;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.PlaneTrade.advertisement.AdvertisementEntity;
import org.example.PlaneTrade.common.entity.BaseEntity;

@Entity
@Table(name = "gallery_images",
        indexes = {
                @Index(name = "idx_gallery_advertisement", columnList = "advertisement_id")
        })
@Getter
@Setter
@NoArgsConstructor
public class GalleryEntity extends BaseEntity {

    @Column(nullable = false, length = 500)
    private String imagePath;   // шлях до файлу

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "advertisement_id")
    private AdvertisementEntity advertisement;
}