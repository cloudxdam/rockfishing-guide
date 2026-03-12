package com.pachedev.rockfishingguide.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.pachedev.rockfishingguide.model.entity.CatchRecord;

public interface CatchRecordRepository extends JpaRepository<CatchRecord, Long> {

    List<CatchRecord> findByDateBetween(@Param("since") LocalDate since, @Param("until") LocalDate until);

    List<CatchRecord> findBySpotId(Long spotId);

    List<CatchRecord> findBySpeciesId(Long speciesId);

    List<CatchRecord> findByEquipmentId(Long equipmentId);

    List<CatchRecord> findByMeteoreologicalConditionId(Long meteorologicalConditionId);

}
