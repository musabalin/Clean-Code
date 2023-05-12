package org.example.repositories.concretes;

import org.example.entities.concretes.Book;
import org.example.repositories.abstracts.BookRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class InMemoryBookRepository implements BookRepository {

    List<Book> books = new ArrayList<>();

    @Override
    public void add(Book entity) {
        books.add(entity);
    }

    @Override
    public void update(Book entity) {

        Book bookToUpdate = books.stream()
                .filter(book -> book.getId() == entity.getId())
                .findFirst()
                .orElseThrow();
        bookToUpdate.setName(entity.getName());
        bookToUpdate.setAuthor(entity.getAuthor());
        bookToUpdate.setPageCount(entity.getPageCount());

    }

    @Override
    public void delete(Book entity) {
        Book bookToDelete = books.stream()
                .filter(book -> book.getId() == entity.getId())
                .findFirst()
                .orElseThrow();
        books.remove(bookToDelete);
    }

    @Override
    public Book getById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book getByBookName(String name) {
        return books.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
