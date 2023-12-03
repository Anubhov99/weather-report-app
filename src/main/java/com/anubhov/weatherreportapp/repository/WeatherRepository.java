package com.anubhov.weatherreportapp.repository;

import com.anubhov.weatherreportapp.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@EnableMongoRepositories
public interface WeatherRepository extends MongoRepository<WeatherEntity, String> {
    List<WeatherEntity> findByLocation(String location);
}
