package capstondesign2.backend.statistics.timeScoreList.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// FE에서 받아오는 <시간, 점수 배열>의 DTO
public class TimeScoreRequestDTO {
    private Double time;
    private Long score;
}
