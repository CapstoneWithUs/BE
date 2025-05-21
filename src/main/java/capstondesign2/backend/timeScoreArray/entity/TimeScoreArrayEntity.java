package capstondesign2.backend.timeScoreArray.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TimeScoreArrayEntity {
    @Id
    private long eachTime;
    private double eachScore;
}
