package pl.com.mazniak.astydz8pd1.utils;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pl.com.mazniak.astydz8pd1.client.WeatherController;
import pl.com.mazniak.astydz8pd1.repo.WeatherInfoRepo;
import pl.com.mazniak.astydz8pd1.service.WeatherService;

@Component
public class Start {
    WeatherService weatherService;

    @Autowired
    public Start(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Scheduled(fixedDelay = 5000)
    public void init() {

        weatherService.saveWeatherInfoAboutCity("Amsterdam");
        System.out.println("Tak");
    }
}
