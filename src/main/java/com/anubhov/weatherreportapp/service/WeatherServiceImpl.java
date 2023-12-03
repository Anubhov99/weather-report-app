package com.anubhov.weatherreportapp.service;

import com.anubhov.weatherreportapp.model.WeatherEntity;
import com.anubhov.weatherreportapp.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@EnableMongoRepositories
public class WeatherServiceImpl implements WeatherService{
    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public List<WeatherEntity> getWeatherEntriesByLocation(String location) {
        return weatherRepository.findByLocation(location);
    }

    @Override
    public WeatherEntity saveWeatherEntry(WeatherEntity weatherEntity) {
        weatherEntity.setTimestamp(LocalDateTime.now());
        return weatherRepository.save(weatherEntity);
    }
}
