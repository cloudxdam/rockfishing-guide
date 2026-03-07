package com.pachedev.rockfishingguide.model.entity;

import com.pachedev.rockfishingguide.model.enums.Season;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity Species represents a fish species.
 * It contains biological and fishing related data such as scientific name,
 * common name, minimum legal size, habitat and the seasons in which the
 * species is typically present.
 */

@Entity
@Table(name = "species")
@Getter
@Setter
@NoArgsConstructor
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "scientific_name", unique = true)
    private String scientificName;

    @Column(name = "common_name", nullable = false, unique = true)
    private String commonName;

    @Column(name = "minimum_size")
    private Integer minimumSize;

    @Column(name = "habitat")
    private String habitat;

    @ElementCollection
    @CollectionTable(name = "species_seasons")
    @Enumerated(EnumType.STRING)
    private Set<Season> seasons;
}
