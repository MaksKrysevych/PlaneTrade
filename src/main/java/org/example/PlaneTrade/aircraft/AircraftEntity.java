package org.example.PlaneTrade.aircraft;

import jakarta.persistence.*;
import lombok.*;
import org.example.PlaneTrade.common.entity.BaseEntity;
import org.example.PlaneTrade.manufacturer.ManufacturerEntity;
import org.example.PlaneTrade.model.ModelEntity;

@Entity
@Table(name = "aircrafts")
@Getter
@Setter
@NoArgsConstructor
public class AircraftEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id")
    private AircraftTypeEntity type;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerEntity manufacturer;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "model_id")
    private ModelEntity model;

    @Column(nullable = false)
    private Integer year;

    @Column(name = "flight_hours", nullable = false)
    private Integer flightHours;

    @Column(length = 50)
    private String color;
}

