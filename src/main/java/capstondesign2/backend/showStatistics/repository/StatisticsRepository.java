package capstondesign2.backend.showStatistics.repository;

import capstondesign2.backend.showStatistics.entity.StatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsRepository extends JpaRepository<StatisticsEntity, Long> {
}
