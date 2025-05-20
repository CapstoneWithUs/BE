package capstondesign2.backend.showStatistics.service;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.showStatistics.entity.StatisticsEntity;
import org.springframework.stereotype.Service;

@Service
public interface StatisticsService {

    void saveStatistics(StatisticsRequestDTO statisticsRequestDTO);
}
