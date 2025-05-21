package capstondesign2.backend.showStatistics.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatisticsResponseDTO {
    private double gradeATime;
    private double gradeBTime;
    private double gradeCTime;
    private double gradeDTime;

    private double sleepTime;
    private double gazeAwayTime;
    private double absenceTime;

    private long focusScore;

    private long startTime;
    private long endTime;

    private String subjectName;
}
