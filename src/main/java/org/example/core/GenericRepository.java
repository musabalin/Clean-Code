package org.example.core;

import java.util.List;

/**
 * @author musa.balin
 */
public interface GenericRepository<T> {
    void add(T entity);

    void update(T entity);

    void delete(T entity);

    T getById(int id);

    List<T> getAll();
}
