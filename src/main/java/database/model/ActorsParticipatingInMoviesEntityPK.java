package database.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ActorsParticipatingInMoviesEntityPK implements Serializable {
    @Column(name = "movie_id", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;
    @Column(name = "actor_id", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long actorId;

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public long getActorId() {
        return actorId;
    }

    public void setActorId(long actorId) {
        this.actorId = actorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActorsParticipatingInMoviesEntityPK that = (ActorsParticipatingInMoviesEntityPK) o;

        if (movieId != that.movieId) return false;
        if (actorId != that.actorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movieId ^ (movieId >>> 32));
        result = 31 * result + (int) (actorId ^ (actorId >>> 32));
        return result;
    }
}
