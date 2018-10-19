package tjh.set.mobileapi;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreHolderRepository extends CrudRepository<ScoreHolder, Long> {

    @Query("SELECT id, user, ((numberOfMatchedSets * 4) + bonusPoints - numberOfHints - wrongGuesses) as score FROM ScoreStats order by score DESC")
    List<ScoreHolder> getHighestScores();
}
