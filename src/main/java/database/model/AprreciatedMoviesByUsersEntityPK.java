package database.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class AprreciatedMoviesByUsersEntityPK implements Serializable {
    @Column(name = "user_id", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name = "movie_id", nullable = false)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AprreciatedMoviesByUsersEntityPK that = (AprreciatedMoviesByUsersEntityPK) o;

        if (userId != that.userId) return false;
        if (movieId != that.movieId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (movieId ^ (movieId >>> 32));
        return result;
    }
}
