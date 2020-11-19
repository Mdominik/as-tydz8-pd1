package pl.com.mazniak.astydz8pd1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.com.mazniak.astydz8pd1.client.WeatherController;
import pl.com.mazniak.astydz8pd1.repo.WeatherInfoRepo;

@Service
public class WeatherService {
    WeatherController weatherController;
    WeatherInfoRepo weatherInfoRepo;

    @Autowired
    public WeatherService(WeatherController weatherController, WeatherInfoRepo weatherInfoRepo) {
        this.weatherController = weatherController;
        this.weatherInfoRepo = weatherInfoRepo;
    }

    public void saveWeatherInfoAboutCity(String city) {
        weatherInfoRepo.save(weatherController.getCurrentWeatherInfo(city));
    }
}
