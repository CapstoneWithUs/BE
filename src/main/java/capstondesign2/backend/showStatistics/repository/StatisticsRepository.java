package capstondesign2.backend.showStatistics.repository;

import capstondesign2.backend.showStatistics.entity.StatisticsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatisticsRepository extends JpaRepository<StatisticsEntity, Long> {

    // 모든 통계 데이터 조회
    List<StatisticsEntity> findAll();

    // 과목명으로 통계 데이터 조회
    List<StatisticsEntity> findBySubjectName(String subjectName);

    // 특정 기간 내의 통계 데이터 조회
    List<StatisticsEntity> findByStartTimeBetween(long startTime, long endTime);

    // 특정 기간 + 과목명으로 조회
    List<StatisticsEntity> findByStartTimeBetweenAndSubjectName(long startTime, long endTime, String subjectName);
}
