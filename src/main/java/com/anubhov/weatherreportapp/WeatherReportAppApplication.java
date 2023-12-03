package com.anubhov.weatherreportapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories
public class WeatherReportAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherReportAppApplication.class, args);
	}

}
