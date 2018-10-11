package tjh.set.mobileapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("highScores")
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

    @GetMapping
    public ResponseEntity<ScoreStats> getScoreStats(@RequestParam(required = true) Long id) {
        ScoreStatsRepository repo = appContext.getBean(ScoreStatsRepository.class);
        return ResponseEntity.ok(repo.findById(id).get());
    }

    @GetMapping
    public ResponseEntity<Iterable<ScoreStats>> getHighScores() {
        ScoreStatsRepository repo = appContext.getBean(ScoreStatsRepository.class);
        return ResponseEntity.ok(repo.findAll());
    }
}
