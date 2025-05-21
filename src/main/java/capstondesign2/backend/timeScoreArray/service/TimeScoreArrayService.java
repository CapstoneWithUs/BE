package capstondesign2.backend.timeScoreArray.service;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import org.springframework.stereotype.Service;

@Service
public interface TimeScoreArrayService {

    void saveTimeScoreArrayData(TimeScoreArrayRequestDTO requestDTO);
}
