package capstondesign2.backend.timeScoreArray.service;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import capstondesign2.backend.timeScoreArray.entity.TimeScoreArrayEntity;
import capstondesign2.backend.timeScoreArray.repository.TimeScoreArrayRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeScoreArrayServiceImpl implements TimeScoreArrayService {

    TimeScoreArrayRepository timeScoreArrayRepository;
    public TimeScoreArrayServiceImpl(TimeScoreArrayRepository timeScoreArrayRepository) {
        this.timeScoreArrayRepository = timeScoreArrayRepository;
    }

    TimeScoreArrayEntity timeScoreArrayEntity = new TimeScoreArrayEntity();

    @Override
    public void saveTimeScoreArrayData(TimeScoreArrayRequestDTO requestDTO) {

        timeScoreArrayEntity.setEachTime(requestDTO.getEachTime());
        timeScoreArrayEntity.setEachScore(requestDTO.getEachScore());

        timeScoreArrayRepository.save(timeScoreArrayEntity);
        System.out.println("시간: " + timeScoreArrayEntity.getEachTime() + ", 점수: " + timeScoreArrayEntity.getEachScore());
    }



}
