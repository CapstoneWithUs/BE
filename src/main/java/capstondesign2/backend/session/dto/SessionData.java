package capstondesign2.backend.session.dto;

import capstondesign2.backend.session.FocusGrade;
import capstondesign2.backend.session.dto.scoreDTO.FocusScorePointDTO;
import capstondesign2.backend.session.dto.scoreDTO.PostSessionDataDTO;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// 메인 정보를 담은 DTO
public class SessionData {
    // 세션 기본 정보(현재는 적용 X)
    // private String sessionId;
    // private String userId;

    // 시간 정보
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long studyTimeMs;
    private Long sleepTimeMs;

    // 집중도 점수
    private Double focusScore;  // 프런트엔드에서 계산되어서 넘어옴

    private FocusGrade focusGrade;

    private GradeArray gradeArray;

    private PostSessionDataDTO postSessionData;

    private List<FocusScorePointDTO> focusScoreList;

    // 눈 깜빡임 통계
    private BlinkStatsDTO blinkStats;

    // 눈 개폐도(EAR) 통계
    private EarStatsDTO earStats;

    // 머리 움직임 통계
    private HeadMovementStatsDTO headMovementStats;

    // 집중도 상태 전환 통계
    private StateTransitionStatsDTO stateTransitionStats;
}

