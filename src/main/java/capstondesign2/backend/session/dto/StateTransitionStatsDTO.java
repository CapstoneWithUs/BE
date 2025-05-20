package capstondesign2.backend.session.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 상태 전환 통계를 위한 내부 클래스
public class StateTransitionStatsDTO {
    private Long studyStateTimeMs;
    private Long sleepStateTimeMs;
    private Long awayStateTimeMs;
    private Long distractedStateTimeMs;
}
