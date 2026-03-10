package com.pachedev.rockfishingguide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pachedev.rockfishingguide.model.entity.MeteorologicalCondition;

public interface MeteorologicalConditionRepository extends JpaRepository<MeteorologicalCondition, Long> {

}
