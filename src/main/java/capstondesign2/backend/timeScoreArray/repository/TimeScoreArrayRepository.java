package capstondesign2.backend.timeScoreArray.repository;

import capstondesign2.backend.timeScoreArray.entity.TimeScoreArrayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.security.auth.Subject;
import java.util.List;

@Repository
public interface TimeScoreArrayRepository extends JpaRepository<TimeScoreArrayEntity, Long> {

    List<TimeScoreArrayEntity> findAll();
    List<TimeScoreArrayEntity> findBySubjectNameAndEachTimeBetween(String subjectName, long startTime, long endTime);

}
