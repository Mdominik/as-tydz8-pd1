package pl.com.mazniak.astydz8pd1.dto;

import pl.com.mazniak.astydz8pd1.model.WeatherInfoAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeatherInfoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String date;
    private String city;
    private String country;
    private int temperature;
    private int pressure;

    public WeatherInfoDTO() {
    }

    public WeatherInfoDTO(String date, String city, String country, Integer temperature, Integer pressure) {
        this.date = date;
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public static WeatherInfoDTO translateToDTO(WeatherInfoAPI weatherInfoAPI) {
        return new WeatherInfoDTO(
                weatherInfoAPI.getCurrent().getObservation_time(),
                weatherInfoAPI.getLocation().getName(),
                weatherInfoAPI.getLocation().getCountry(),
                weatherInfoAPI.getCurrent().getTemperature(),
                weatherInfoAPI.getCurrent().getPressure()

        );
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

}