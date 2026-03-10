package com.pachedev.rockfishingguide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.Technique;

public interface TechniqueRepository extends JpaRepository<Technique, Long> {

}
