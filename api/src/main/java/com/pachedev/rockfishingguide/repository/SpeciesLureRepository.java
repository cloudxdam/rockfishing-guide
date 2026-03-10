package com.pachedev.rockfishingguide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.Lure;
import com.pachedev.rockfishingguide.model.entity.Species;
import com.pachedev.rockfishingguide.model.entity.SpeciesLure;
import com.pachedev.rockfishingguide.model.enums.RetrieveStyle;

public interface SpeciesLureRepository extends JpaRepository<SpeciesLure, Long> {

    List<SpeciesLure> findBySpecies(Species species);

    List<SpeciesLure> findByLure(Lure lure);

    List<SpeciesLure> findByEffectiveness(Integer effectiveness);

    List<SpeciesLure> findByRetrieveStyle(RetrieveStyle retrieveStyle);
}
