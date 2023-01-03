package org.example;

import database.dao.ActorDao;
import database.dao.MovieDao;
import database.model.ActorEntity;
import database.model.MoviesEntity;
import database.populate.PopulateDbWithMovies;
import enums.Genre;

import java.time.LocalDate;
import java.util.Date;

public class App 
{
    public static void main( String[] args )
    {
        var actorsList = new ActorDao();

//        ActorEntity actor1=new ActorEntity();
//        actor1.setForename("Michael");
//        actor1.setSurname("Jackson");
//        actorsList.create(actor1);

//        MoviesEntity _2012=new MoviesEntity();
//        _2012.setTitle("Piratii din Caraibe");
//        _2012.setDescription("Something");
//        _2012.setImage("something");
//        _2012.setMovieStudio("Werner Bros");
//        _2012.setDirector("John Stone");
//        _2012.setReleaseDate(LocalDate.of(2003, 12, 14));
//        _2012.setGenre(Genre.ACTION.toString());
//        _2012.setMovieId(21);

        var moviesList=new MovieDao();
        //moviesList.create(_2012);


        //PopulateDbWithMovies db=new PopulateDbWithMovies(moviesList);

        //db.readFromFile("src\\main\\resources\\FilesWithData\\Movies.txt");

        for(var movie:moviesList.getAll())
            System.out.println(movie);

        for(var actor : actorsList.getAll())
            System.out.println(actor.getForename());

    }
}
