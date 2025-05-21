package capstondesign2.backend.timeScoreArray.repository;

import capstondesign2.backend.timeScoreArray.entity.TimeScoreArrayEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeScoreArrayRepository extends JpaRepository<TimeScoreArrayEntity, Long> {
}
