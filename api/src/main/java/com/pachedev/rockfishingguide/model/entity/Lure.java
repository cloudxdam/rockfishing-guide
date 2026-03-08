package com.pachedev.rockfishingguide.model.entity;

import java.util.Set;

import com.pachedev.rockfishingguide.model.enums.LureType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity Lure represents an artificial fishing lure.
 *
 * It stores information about the lure type, its shape (when applicable),
 * color and weight.
 *
 * The shape attribute is mainly used for soft baits, such as worm,
 * shrimp or creature patterns.
 */

@Entity
@Table(name = "lures")
@Getter
@Setter
@NoArgsConstructor
public class Lure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "lure_type", nullable = false)
    private LureType lureType;

    @Column(name = "shape")
    private String shape;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @OneToMany(mappedBy = "lure")
    private Set<SpeciesLure> speciesLures;

}
