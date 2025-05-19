package capstondesign2.backend.statistics.timeScoreList.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
// FE에서 받아오는 <시간, 점수 배열>
public class TimeScoreResponseDTO {
    private List<TimeScoreRequestDTO> timeScoreList; // 시간과 점수 리스트
}
