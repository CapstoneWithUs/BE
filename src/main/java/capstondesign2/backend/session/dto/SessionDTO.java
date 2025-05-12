package capstondesign2.backend.session.dto;

import java.time.LocalDateTime;


// 메인 정보를 담은 DTO
public class SessionDTO {
    // 세션 기본 정보(현재는 적용 X)
    // private String sessionId;
    // private String userId;

    // 시간 정보
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long studyTimeMs;
    private Long sleepTimeMs;

    // 집중도 점수
    private Double focusScore;

    // 눈 깜빡임 통계
    private BlinkStatsDTO blinkStats;

    // 눈 개폐도(EAR) 통계
    private EarStatsDTO earStats;

    // 머리 움직임 통계
    private HeadMovementStatsDTO headMovementStats;

    // 집중도 상태 전환 통계
    private StateTransitionStatsDTO stateTransitionStats;
}

