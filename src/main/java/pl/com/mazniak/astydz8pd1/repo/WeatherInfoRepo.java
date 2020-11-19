package pl.com.mazniak.astydz8pd1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.mazniak.astydz8pd1.dto.WeatherInfoDTO;

@Repository
public interface WeatherInfoRepo extends JpaRepository<WeatherInfoDTO, Long> {

}
