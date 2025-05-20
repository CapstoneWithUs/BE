package capstondesign2.backend.session.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 머리 움직임 통계를 위한 내부 클래스
public class HeadMovementStatsDTO {
    private Double avgHeadAngleVelocity;
    private Double avgHeadMovementVelocity;
}
