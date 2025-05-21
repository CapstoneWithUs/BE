package capstondesign2.backend.showStatistics.entity;

import capstondesign2.backend.entity.BaseEntity;
import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StatisticsEntity {
    private double gradeATime;
    private double gradeBTime;
    private double gradeCTime;
    private double gradeDTime;

    private double sleepTime;
    private double gazeAwayTime;
    private double absenceTime;

    private double focusScore;

    @Id
    private long startTime;
    private long endTime;

    private String subjectName;

    public StatisticsEntity() {

    }

}
