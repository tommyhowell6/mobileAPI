package tjh.set.mobileapi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ScoreHolder {

    @Id
    private long id;
    private String user;
    private int score;

    public ScoreHolder() {
    }

    public ScoreHolder(long id, String user, int score) {
        this.id = id;
        this.user = user;
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
