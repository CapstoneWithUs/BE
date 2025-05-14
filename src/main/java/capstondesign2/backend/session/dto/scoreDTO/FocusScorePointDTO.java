package capstondesign2.backend.session.dto.scoreDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FocusScorePointDTO {
    private Long time;      // ms 단위 시간
    private Double score;   // 점수
}
