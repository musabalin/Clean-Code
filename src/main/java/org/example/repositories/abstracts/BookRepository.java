package org.example.repositories.abstracts;

import org.example.core.GenericRepository;
import org.example.entities.concretes.Book;

/**
 * @author musa.balin
 */
public interface BookRepository extends GenericRepository<Book> {
    Book getByBookName(String name);
}
