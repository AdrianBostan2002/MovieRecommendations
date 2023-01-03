package database.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies", schema = "public", catalog = "proiect_mip")
public class MoviesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "movie_id", nullable = false)
    private long movieId;
    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;
    @Basic
    @Column(name = "description", nullable = true, length = 300)
    private String description;
    @Basic
    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;
    @Basic
    @Column(name = "movie_studio", nullable = true, length = 50)
    private String movieStudio;
    @Basic
    @Column(name = "director", nullable = true, length = 50)
    private String director;
    @Basic
    @Column(name = "image", nullable = true, length = 50)
    private String image;
    @Basic
    @Column(name = "genre", nullable = false, length = 50)
    private String genre;

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMovieStudio() {
        return movieStudio;
    }

    public void setMovieStudio(String movieStudio) {
        this.movieStudio = movieStudio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString()
    {
        return "Title: " + title + " Release Date: " + releaseDate.toString() +  " Genre: " + genre+ " movie studio: " + movieStudio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoviesEntity that = (MoviesEntity) o;

        if (movieId != that.movieId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (releaseDate != null ? !releaseDate.equals(that.releaseDate) : that.releaseDate != null) return false;
        if (movieStudio != null ? !movieStudio.equals(that.movieStudio) : that.movieStudio != null) return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (movieId ^ (movieId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (movieStudio != null ? movieStudio.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }
}
