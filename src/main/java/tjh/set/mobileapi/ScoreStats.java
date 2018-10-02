package tjh.set.mobileapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class ScoreStats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int numberOfHints;
    private int numberOfMatchedSets;
    private int bonusPoints;
    private int wrongGuesses;
    private String user;


    public ScoreStats(int numberOfHints, int numberOfMatchedSets, int bonusPoints, int wrongGuesses, String user) {
        this.numberOfHints = numberOfHints;
        this.numberOfMatchedSets = numberOfMatchedSets;
        this.bonusPoints = bonusPoints;
        this.wrongGuesses = wrongGuesses;
        this.user = user;
    }

    public ScoreStats() {
    }

    public int getNumberOfHints() {
        return numberOfHints;
    }

    public int getNumberOfMatchedSets() {
        return numberOfMatchedSets;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public int getWrongGuesses() {
        return wrongGuesses;
    }

    public void setNumberOfHints(int numberOfHints) {
        this.numberOfHints = numberOfHints;
    }

    public void setNumberOfMatchedSets(int numberOfMatchedSets) {
        this.numberOfMatchedSets = numberOfMatchedSets;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public void setWrongGuesses(int wrongGuesses) {
        this.wrongGuesses = wrongGuesses;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
