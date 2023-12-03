package com.anubhov.weatherreportapp.service;

import com.anubhov.weatherreportapp.model.WeatherEntity;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;
@EnableMongoRepositories
public interface WeatherService {
    public List<WeatherEntity> getWeatherEntriesByLocation(String location);
    public WeatherEntity saveWeatherEntry(WeatherEntity weatherEntity);
}
