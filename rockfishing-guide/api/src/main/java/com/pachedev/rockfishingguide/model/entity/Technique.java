package com.pachedev.rockfishingguide.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Entity Technique represents a fishing technique.
 *
 * It stores the name of the technique, the recommended lure weight range
 * and an optional description.
 */

@Entity
@Table(name = "techniques")
@Getter
@Setter
@NoArgsConstructor
public class Technique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "weight_range")
    private String weightRange;

    @Column(name = "description", length = 1000)
    private String description;
}
