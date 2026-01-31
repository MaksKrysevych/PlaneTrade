package org.example.PlaneTrade.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.PlaneTrade.common.entity.BaseEntity;
import org.example.PlaneTrade.manufacturer.ManufacturerEntity;

@Entity
@Table(name = "aircraft_models")
@Getter
@Setter
@NoArgsConstructor
public class ModelEntity extends BaseEntity {

    @Column(nullable = false, length = 150)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturer;
}

