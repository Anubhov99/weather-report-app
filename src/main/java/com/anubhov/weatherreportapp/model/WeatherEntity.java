package com.anubhov.weatherreportapp.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EnableMongoRepositories
@Document("weatherEntity")
public class WeatherEntity {
    private String location;
    private double temperature;
    private String weatherCondition;
    private LocalDateTime timestamp;
}
