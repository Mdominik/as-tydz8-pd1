package pl.com.mazniak.astydz8pd1.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.com.mazniak.astydz8pd1.dto.WeatherInfoDTO;
import pl.com.mazniak.astydz8pd1.model.WeatherInfoAPI;
import pl.com.mazniak.astydz8pd1.utils.APIAccess;

@Controller
public class WeatherController {

    public WeatherController() {

    }

    public WeatherInfoDTO getCurrentWeatherInfo(String city) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherInfoAPI forObject = restTemplate.getForObject(APIAccess.getUrlByCity(city), WeatherInfoAPI.class);
        System.out.println(forObject.getLocation().getName());
        return WeatherInfoDTO.translateToDTO(forObject);
    }

}
