package org.example.repositories.concretes;

import org.example.entities.concretes.Author;
import org.example.repositories.abstracts.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class InMemoryAuthorRepository implements AuthorRepository {

    List<Author> authors = new ArrayList<>();

    @Override
    public void add(Author entity) {
        authors.add(entity);
    }

    @Override
    public void update(Author entity) {

        Author authorToUpdate = authors.stream()
                .filter(author -> author.getId() == entity.getId())
                .findFirst()
                .orElseThrow();
        authorToUpdate.setName(entity.getName());
        authorToUpdate.setAge(entity.getAge());
        authorToUpdate.setSurname(entity.getSurname());
        authorToUpdate.setNationalityId(entity.getNationalityId());
    }

    @Override
    public void delete(Author entity) {
        Author authorToDelete = authors.stream()
                .filter(author -> author.getId() == entity.getId())
                .findFirst()
                .orElseThrow();
        authors.remove(authorToDelete);
    }

    @Override
    public Author getById(int id) {
        return authors.stream()
                .filter(author -> author.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Author> getAll() {
        return authors;
    }

    @Override
    public Author getAuthorByNationalityId(String nationalityId) {
        return authors.stream()
                .filter(author -> author.getNationalityId() == nationalityId)
                .findFirst()
                .orElse(null);
    }
}
