package org.example.repositories.abstracts;

import org.example.core.GenericRepository;
import org.example.entities.concretes.Author;

import java.util.List;

/**
 * @author musa.balin
 */
public interface AuthorRepository extends GenericRepository<Author> {
    Author getAuthorByNationalityId(String nationalityId);
}
