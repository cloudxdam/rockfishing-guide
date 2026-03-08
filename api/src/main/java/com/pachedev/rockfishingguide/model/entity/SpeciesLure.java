package com.pachedev.rockfishingguide.model.entity;

import com.pachedev.rockfishingguide.model.enums.RetrieveStyle;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "species_Lure")
@Getter
@Setter
@NoArgsConstructor
public class SpeciesLure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    @ManyToOne
    @JoinColumn(name = "lure_id")
    private Lure lure;

    @Column(name = "effectiveness")
    private Integer effectiveness;

    @Enumerated(EnumType.STRING)
    @Column(name = "retrieve_style")
    private RetrieveStyle retrieveStyle;

    @Column(name = "notes")
    private String notes;
}
