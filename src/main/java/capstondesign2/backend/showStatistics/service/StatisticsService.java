package capstondesign2.backend.showStatistics.service;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.showStatistics.dto.StatisticsResponseDTO;
import capstondesign2.backend.showStatistics.entity.StatisticsEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface StatisticsService {

    void saveStatistics(StatisticsRequestDTO statisticsRequestDTO);

    List<StatisticsResponseDTO> getAllStatistics();

    List<StatisticsResponseDTO> getStatisticsBySubject(String subjectName);

    List<StatisticsResponseDTO> getStatisticsForTimeRange(long startTime, long endTime);

    List<StatisticsResponseDTO> getStatisticsBySubjectAndTimeRange(String subjectName, long startTime, long endTime);

//    Map<String, Object> getDailySummary(long date);
}
