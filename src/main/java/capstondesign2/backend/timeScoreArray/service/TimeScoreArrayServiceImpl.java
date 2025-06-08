package capstondesign2.backend.timeScoreArray.service;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayResponseDTO;
import capstondesign2.backend.timeScoreArray.entity.TimeScoreArrayEntity;
import capstondesign2.backend.timeScoreArray.repository.TimeScoreArrayRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeScoreArrayServiceImpl implements TimeScoreArrayService {

    TimeScoreArrayRepository timeScoreArrayRepository;
    public TimeScoreArrayServiceImpl(TimeScoreArrayRepository timeScoreArrayRepository) {
        this.timeScoreArrayRepository = timeScoreArrayRepository;
    }

    @Override
    public void saveTimeScoreArrayData(TimeScoreArrayRequestDTO requestDTO) {

        TimeScoreArrayEntity timeScoreArrayEntity = new TimeScoreArrayEntity();


        timeScoreArrayEntity.setEachTime(requestDTO.getEachTime());
        timeScoreArrayEntity.setEachScore(requestDTO.getEachScore());
        timeScoreArrayEntity.setSubjectName(requestDTO.getSubjectName());

        timeScoreArrayRepository.save(timeScoreArrayEntity);
        System.out.println("시간: " + timeScoreArrayEntity.getEachTime() + ", 점수: " + timeScoreArrayEntity.getEachScore() + ", 과목: " + timeScoreArrayEntity.getSubjectName());
    }

    @Override
    public List<TimeScoreArrayResponseDTO> getAllTimeScoreArrayData() {
        List<TimeScoreArrayEntity> entities = timeScoreArrayRepository.findAll();

        return entities.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<TimeScoreArrayResponseDTO> getTimeScoreArrayDataBySubjectNameBetweenStartTimeAndEndTime(String subjectName, long startTime, long endTime) {
        List<TimeScoreArrayEntity> entities = timeScoreArrayRepository.findBySubjectNameAndEachTimeBetween(subjectName, startTime, endTime);

        return entities.stream()
                .map(this::convertToResponseDTO)
                .collect(Collectors.toList());
    }


    // Entity to DTO
    public TimeScoreArrayResponseDTO convertToResponseDTO(TimeScoreArrayEntity entity) {
        TimeScoreArrayResponseDTO dto = new TimeScoreArrayResponseDTO();

        dto.setEachScore(entity.getEachScore());
        dto.setEachTime(entity.getEachTime());
        dto.setSubjectName(entity.getSubjectName());

        return dto;
    }


}
