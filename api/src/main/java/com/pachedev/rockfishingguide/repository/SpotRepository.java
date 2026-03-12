package com.pachedev.rockfishingguide.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.Spot;
import com.pachedev.rockfishingguide.model.enums.AccessDifficulty;
import com.pachedev.rockfishingguide.model.enums.FishingPressure;
import com.pachedev.rockfishingguide.model.enums.SpotType;

public interface SpotRepository extends JpaRepository<Spot, Long> {

    Optional<Spot> findByNameContainingIgnoreCase(String name);

    List<Spot> findByAccessDifficulty(AccessDifficulty accessDifficulty);

    List<Spot> findBySpotType(SpotType spotType);

    List<Spot> findByFishingPressure(FishingPressure fishingPressure);

    List<Spot> findBySpeciesId(Long speciesId);

    List<Spot> findBySpecies_CommonName(String commonName);

}
