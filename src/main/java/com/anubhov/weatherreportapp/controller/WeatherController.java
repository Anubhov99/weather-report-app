package com.anubhov.weatherreportapp.controller;

import com.anubhov.weatherreportapp.model.WeatherEntity;
import com.anubhov.weatherreportapp.service.WeatherService;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableMongoRepositories
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }



    @GetMapping("/{location}")
    public List<WeatherEntity> getWeatherEntriesByLocation(@PathVariable String location) {
        return weatherService.getWeatherEntriesByLocation(location);
    }

    @PostMapping
    public WeatherEntity saveWeatherEntry(@RequestBody WeatherEntity weatherEntity) {
        return weatherService.saveWeatherEntry(weatherEntity);
    }
}
