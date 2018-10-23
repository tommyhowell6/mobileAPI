package tjh.set.mobileapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("scores")
public class SetController {

    @Autowired
    private ApplicationContext appContext;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ScoreStats> postScoreStats(@RequestBody ScoreStats stats)
    {
        ScoreStatsRepository repo = appContext.getBean(ScoreStatsRepository.class);
        ScoreStats result = repo.save(stats);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ScoreStats> getScoreStats(@PathVariable("id") Long id) {
        ScoreStatsRepository repo = appContext.getBean(ScoreStatsRepository.class);
        return ResponseEntity.ok(repo.findById(id).get());
    }

    @GetMapping
    public ResponseEntity<List<ScoreHolder>> getHighScores() {
        ScoreHolderRepository repo = appContext.getBean(ScoreHolderRepository.class);
        List<ScoreHolder> sortedHighScoreList = repo.getHighestScores().stream()
            .sorted(Comparator.comparingInt(ScoreHolder::getScore).reversed())
            .collect(Collectors.toList());
        return ResponseEntity.ok(sortedHighScoreList);
    }
}
