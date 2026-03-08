package com.pachedev.rockfishingguide.model.entity;

import com.pachedev.rockfishingguide.model.enums.TipType;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "equipment")
@Getter
@Setter
@NoArgsConstructor
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "lure_weight")
    private Double lureWeight;

    @Column(name = "length")
    private Double length;

    @Enumerated(EnumType.STRING)
    @Column(name = "tip_type")
    private TipType tipType;

    @ManyToOne
    @JoinColumn(name = "technique_id")
    private Technique technique;
}
