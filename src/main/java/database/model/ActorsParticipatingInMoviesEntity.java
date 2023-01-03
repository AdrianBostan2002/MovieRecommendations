package database.model;

import javax.persistence.*;

@Entity
@Table(name = "actors_participating_in_movies", schema = "public", catalog = "proiect_mip")
@IdClass(ActorsParticipatingInMoviesEntityPK.class)
public class ActorsParticipatingInMoviesEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "movie_id", nullable = false)
    private long movieId;
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id", nullable = false)
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

        ActorsParticipatingInMoviesEntity that = (ActorsParticipatingInMoviesEntity) o;

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
