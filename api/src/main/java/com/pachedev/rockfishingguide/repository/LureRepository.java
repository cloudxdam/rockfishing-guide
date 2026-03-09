package com.pachedev.rockfishingguide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.Lure;

public interface LureRepository extends JpaRepository<Lure, Long> {

    List<Lure> findLureByTechniqueId(Long techniqueId);
}
