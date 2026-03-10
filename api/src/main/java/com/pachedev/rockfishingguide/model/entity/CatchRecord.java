package com.pachedev.rockfishingguide.model.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "catch_record")
@Getter
@Setter
@NoArgsConstructor
public class CatchRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "size_cm")
    private Double size;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "depth")
    private Double depth;

    @Column(name = "seabed", nullable = false)
    private String seabed;

    @ManyToOne
    @JoinColumn(name = "spot_id")
    private Spot spot;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToOne
    @JoinColumn(name = "lure_id")
    private Lure lure;

    @ManyToOne
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @ManyToOne
    @JoinColumn(name = "meteorological_condition_id")
    private MeteorologicalCondition meteorologicalCondition;

}
