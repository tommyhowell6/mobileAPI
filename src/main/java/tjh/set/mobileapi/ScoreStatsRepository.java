package tjh.set.mobileapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreStatsRepository extends CrudRepository<ScoreStats, Long> {

}
