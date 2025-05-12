package capstondesign2.backend.session.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
// Grade 별 시간
public class GradeArray {
    private String grade;
    private Map<SessionData, String> gradeMap = new HashMap<>();

    public GradeArray() {}

    public GradeArray(String grade) {
        this.grade = grade;
    }

    public void setGradeMap(SessionData sessionData, String grade) {
        gradeMap.put(sessionData, grade);
    }
}
