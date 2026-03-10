package com.pachedev.rockfishingguide.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.Species;

public interface SpeciesRepository extends JpaRepository<Species, Long> {

    Optional<Species> findByCommonName(String commonName);

}
