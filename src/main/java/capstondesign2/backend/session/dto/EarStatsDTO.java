package capstondesign2.backend.session.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 눈 개폐도 통계를 위한 내부 클래스
public class EarStatsDTO {
    private Double avgLeftEar;
    private Double avgRightEar;
    private Double minLeftEar;
    private Double minRightEar;
}
