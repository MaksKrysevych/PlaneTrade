package org.example.PlaneTrade.manufacturer;

import jakarta.persistence.*;
import lombok.*;
import org.example.PlaneTrade.aircraft.AircraftTypeEntity;
import org.example.PlaneTrade.common.entity.BaseEntity;


@Entity
@Table(name = "manufacturers")
@Getter
@Setter
@NoArgsConstructor
public class ManufacturerEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 150)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id")
    private AircraftTypeEntity type;
}

