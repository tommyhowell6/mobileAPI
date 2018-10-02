package tjh.set.mobileapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreStatsRepository extends CrudRepository<ScoreStats, Long> {

}
