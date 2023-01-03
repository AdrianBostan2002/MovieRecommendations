package database.dao;

import database.DatabaseConnection;
import database.model.MoviesEntity;

import javax.persistence.TypedQuery;
import java.util.List;

public class MovieDao implements IDao<MoviesEntity> {
    private DatabaseConnection connection = new DatabaseConnection();

    @Override
    public MoviesEntity get(Long id) {
        return connection.getEntityManager().find(MoviesEntity.class, id);
    }

    @Override
    public List<MoviesEntity> getAll() {
        TypedQuery<MoviesEntity> query = connection.getEntityManager().createQuery("SELECT m FROM MoviesEntity m ORDER BY m.movieId", MoviesEntity.class);
        return query.getResultList();
    }

    @Override
    public void create(MoviesEntity movieEntity) {
        connection.executeTransaction(entityManager -> entityManager.persist(movieEntity));
    }
}
