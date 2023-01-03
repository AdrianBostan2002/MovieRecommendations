package database.dao;

import java.util.List;

public interface IDao<T> {
    T get(Long id);

    List<T> getAll();

    void create(T t);
}

