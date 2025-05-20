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
    private Double gradeATime;
    private Double gradeBTime;
    private Double gradeCTime;
    private Double gradeDTime;

    private Double sleepTime;
    private Double gazeAwayTime;
    private Double absenceTime;

    private Long focusScore;

    @Id
    private Double startTime;
    private Double endTime;

    private String subjectName;

    public StatisticsEntity() {

    }

}
