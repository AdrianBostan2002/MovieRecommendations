package database.model;

import javax.persistence.*;

@Entity
@Table(name = "aprreciated_movies_by_users", schema = "public", catalog = "proiect_mip")
@IdClass(AprreciatedMoviesByUsersEntityPK.class)
public class AprreciatedMoviesByUsersEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false)
    private long userId;
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "movie_id", nullable = false)
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

        AprreciatedMoviesByUsersEntity that = (AprreciatedMoviesByUsersEntity) o;

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
