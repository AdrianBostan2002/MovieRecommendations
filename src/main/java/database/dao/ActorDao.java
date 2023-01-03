package database.dao;

import database.DatabaseConnection;
import database.model.ActorEntity;

import javax.persistence.TypedQuery;
import java.util.List;

public class ActorDao implements IDao<ActorEntity> {
    private DatabaseConnection connection = new DatabaseConnection();

    @Override
    public ActorEntity get(Long id) {
        return connection.getEntityManager().find(ActorEntity.class, id);
    }

    @Override
    public List<ActorEntity> getAll() {
        TypedQuery<ActorEntity> query = connection.getEntityManager().createQuery("SELECT m FROM ActorEntity m ORDER BY m.actorId", ActorEntity.class);
        return query.getResultList();
    }

    @Override
    public void create(ActorEntity actorEntity) {
        connection.executeTransaction(entityManager -> entityManager.persist(actorEntity));
    }

}
