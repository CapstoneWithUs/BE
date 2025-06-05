package capstondesign2.backend.timeScoreArray.service;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TimeScoreArrayService {

    void saveTimeScoreArrayData(TimeScoreArrayRequestDTO requestDTO);

    List<TimeScoreArrayResponseDTO> getAllTimeScoreArrayData();
    List<TimeScoreArrayResponseDTO> getTimeScoreArrayDataBySubjectNameBetweenStartTimeAndEndTime(String subjectName, long startTime, long endTime);
}
