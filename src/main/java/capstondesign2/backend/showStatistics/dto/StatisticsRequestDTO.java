package capstondesign2.backend.showStatistics.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatisticsRequestDTO {
    private Double gradeATime;
    private Double gradeBTime;
    private Double gradeCTime;
    private Double gradeDTime;

    private Double sleepTime;
    private Double gazeAwayTime;
    private Double absenceTime;

    private Long focusScore;

    private Double startTime;
    private Double endTime;

    private String subjectName;
}
