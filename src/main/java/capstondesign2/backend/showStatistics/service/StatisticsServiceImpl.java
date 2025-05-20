package capstondesign2.backend.showStatistics.service;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.showStatistics.entity.StatisticsEntity;
import capstondesign2.backend.showStatistics.repository.StatisticsRepository;
import org.springframework.stereotype.Service;

@Service
public class StatisticsServiceImpl implements StatisticsService{

    StatisticsRepository statisticsRepository;
    public StatisticsServiceImpl(StatisticsRepository statisticsRepository) {
        this.statisticsRepository = statisticsRepository;
    }

    StatisticsEntity statisticsEntity = new StatisticsEntity();

    @Override
    public void saveStatistics(StatisticsRequestDTO requestDTO) {

        statisticsEntity.setGradeATime(requestDTO.getGradeATime());
        statisticsEntity.setGradeBTime(requestDTO.getGradeBTime());
        statisticsEntity.setGradeCTime(requestDTO.getGradeCTime());
        statisticsEntity.setGradeDTime(requestDTO.getGradeDTime());

        statisticsEntity.setSleepTime(requestDTO.getSleepTime());
        statisticsEntity.setGazeAwayTime(requestDTO.getGazeAwayTime());
        statisticsEntity.setAbsenceTime(requestDTO.getAbsenceTime());


        statisticsEntity.setFocusScore(requestDTO.getFocusScore());

        statisticsEntity.setStartTime(requestDTO.getStartTime());
        statisticsEntity.setEndTime(requestDTO.getEndTime());

        statisticsEntity.setSubjectName(requestDTO.getSubjectName());


        statisticsRepository.save(statisticsEntity);
        System.out.println("시작시간: " + statisticsEntity.getStartTime() + ", 종료 시간: " + statisticsEntity.getEndTime() +
                ", 집중도: " + statisticsEntity.getFocusScore() + ", A등급 시간: " + statisticsEntity.getGradeATime() +
                ", B등급 시간: " + statisticsEntity.getGradeBTime() + ", C등급 시간: " + statisticsEntity.getGradeCTime() +
                ", D등급 시간: " + statisticsEntity.getGradeDTime());
    }
}
