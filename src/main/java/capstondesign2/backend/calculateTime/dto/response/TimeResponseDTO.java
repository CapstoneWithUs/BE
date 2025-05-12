package capstondesign2.backend.calculateTime.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TimeResponseDTO {

    private static String studyTimeMs;  // 공부 시간 (밀리초)
    private static String  sleepTimeMs;  // 수면 시간 (밀리초)
    private static String  awayTimeMs;  // 자리 이탈 시간 (계산 필요)
    private static String  distractedTimeMs;  // 다른 곳 응시 시간 (계산 필요)
    private static String totalSessionTimeMs;  // 총 세션 시간 (계산 필요)
    private static String  blinkRate;  // 분당 눈 깜빡임 횟수 (계산 필요)
    private static String  focusScore;  // 집중도 점수 (calculateFocusScore.jsx에서 계산)
    private static String  timestamp;  // 세션 종료 시간
//    private static String userId;

    public TimeResponseDTO(String studyTimeMs) {}
}
