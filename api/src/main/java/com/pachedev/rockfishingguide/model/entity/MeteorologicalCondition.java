package com.pachedev.rockfishingguide.model.entity;

import com.pachedev.rockfishingguide.model.enums.SeaState;
import com.pachedev.rockfishingguide.model.enums.SkyCondition;
import com.pachedev.rockfishingguide.model.enums.TideStatus;
import com.pachedev.rockfishingguide.model.enums.WindDirection;

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

@Entity
@Table(name = "meteorological_condition")
@Getter
@Setter
@NoArgsConstructor
public class MeteorologicalCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private String time;

    @Enumerated(EnumType.STRING)
    @Column(name = "tide_status", nullable = false)
    private TideStatus tideStatus;

    @Column(name = "high_tide_time")
    private String highTideTime;

    @Column(name = "low_tide_time")
    private String lowTideTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "wind_direction")
    private WindDirection windDirection;

    @Column(name = "wind_speed")
    private Integer windSpeed;

    @Enumerated(EnumType.STRING)
    @Column(name = "sea_state")
    private SeaState seaState;

    @Enumerated(EnumType.STRING)
    @Column(name = "sky_condition")
    private SkyCondition skyCondition;

}
