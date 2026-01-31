package org.example.PlaneTrade.aircraft;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.PlaneTrade.common.entity.BaseEntity;

@Entity
@Table(name = "aircraft_types")
@Getter
@Setter
@NoArgsConstructor
public class AircraftTypeEntity extends BaseEntity {

    @Column(nullable = false, unique = true, length = 100)
    private String name;
}

