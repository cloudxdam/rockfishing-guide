package com.pachedev.rockfishingguide.model.entity;

import com.pachedev.rockfishingguide.model.enums.AccessDifficulty;
import com.pachedev.rockfishingguide.model.enums.FishingPressure;
import com.pachedev.rockfishingguide.model.enums.SpotType;

import jakarta.persistence.Column;
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
 * Entity Spot represents a fishing spot.
 * It includes name, access difficulty, spot type,
 * description, distance from parking and fishing pressure.
 */

@Entity
@Table(name = "spots")
@Getter
@Setter
@NoArgsConstructor
public class Spot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "access_difficulty", nullable = false)
    @Enumerated(EnumType.STRING)
    private AccessDifficulty accessDifficulty;

    @Column(name = "spot_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private SpotType spotType;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "distance_from_parking")
    private Double distanceFromParking;

    @Column(name = "fishing_pressure")
    @Enumerated(EnumType.STRING)
    private FishingPressure fishingPressure;

}
