package capstondesign2.backend.statistics.attentionState.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttentionStateDTO {
    private Double gazeAwayTimeMs;   // 다른 곳 응시
    private Double absenceTimeMs;  // 자리 이탈
    private Double sleepTimeMs;  // 졸음
}
