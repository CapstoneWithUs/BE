package capstondesign2.backend.session.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 눈 깜빡임 통계를 위한 내부 클래스
public class BlinkStatsDTO {
    private Double leftEyeBlinkRatePerMinute;
    private Double rightEyeBlinkRatePerMinute;
    private Double avgBlinkRatePerMinute;
}
