package org.example.PlaneTrade.advertisement;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.PlaneTrade.aircraft.AircraftEntity;
import org.example.PlaneTrade.common.entity.BaseEntity;
import org.example.PlaneTrade.gallery.GalleryEntity;
import org.example.PlaneTrade.user.UserEntity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(
        name = "advertisements",
        indexes = {
                @Index(name = "idx_ads_owner", columnList = "owner_id"),
                @Index(name = "idx_ads_price", columnList = "price"),
                @Index(name = "idx_ads_region_city", columnList = "region, city"),
                @Index(name = "idx_ads_status", columnList = "status")
        }
)
@Getter
@Setter
@NoArgsConstructor
public class AdvertisementEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_id")
    private UserEntity owner;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "aircraft_id", unique = true)
    private AircraftEntity aircraft;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 30)
    private AdvertisementStatus status;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

    @Column(nullable = false, length = 100)
    private String region;

    @Column(nullable = false, length = 100)
    private String city;

    @Column(length = 2000)
    private String description;

    @OneToMany(
            mappedBy = "advertisement",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Set<GalleryEntity> gallery = new HashSet<>();
}
