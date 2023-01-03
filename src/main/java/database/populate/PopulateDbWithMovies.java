package database.populate;

import database.dao.IDao;
import database.model.MoviesEntity;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

public class PopulateDbWithMovies extends PopulateDb {

    public PopulateDbWithMovies(IDao database)
    {
        super(database);
    }

    @Override
    public void readFromFile(String fileName) {
        try {
            BufferedReader bufInput=new BufferedReader(new FileReader(fileName));
            String title=bufInput.readLine();
            String genre= bufInput.readLine();
            String description = bufInput.readLine();
            String releaseDate=bufInput.readLine();
            String movieStudio= bufInput.readLine();
            String director= bufInput.readLine();

            MoviesEntity movie = createMovie(title, genre, description, releaseDate, movieStudio, director);
            addIntoDb(movie);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public MoviesEntity createMovie(String title, String genre, String description,
                                    String releaseDate, String movieStudio, String director){
        MoviesEntity movie=new MoviesEntity();
        movie.setTitle(title);
        movie.setGenre(genre);
        movie.setDescription(description);
        movie.setReleaseDate(LocalDate.parse(releaseDate));
        movie.setMovieStudio(movieStudio);
        movie.setDirector(director);
        return movie;
    }

    public void addIntoDb(MoviesEntity movie){
        if(movie!=null) {
            database.create(movie);
        }
    }
}
