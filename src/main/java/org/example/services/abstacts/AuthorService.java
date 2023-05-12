package org.example.services.abstacts;

import org.example.entities.concretes.Author;

import java.util.List;

/**
 * @author musa.balin
 */
public interface AuthorService {
    void add(Author author);
    List<Author> getAll();
}
