package org.example.services.concretes;

import org.example.entities.concretes.Author;
import org.example.repositories.abstracts.AuthorRepository;
import org.example.services.abstacts.AuthorService;

import java.util.List;

/**
 * @author musa.balin
 */
public class AuthorManager implements AuthorService {
    private AuthorRepository authorRepository;

    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void add(Author author) {
        checkIfAuthorWithSameNationalityIdExists(author.getNationalityId());
        authorRepository.add(author);
        System.out.println("Yazar eklendi.");
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    private void checkIfAuthorWithSameNationalityIdExists(String nationalityId) {
        if (authorRepository.getAuthorByNationalityId(nationalityId) != null) {
            System.out.println("Bu TCKN ile bir yazar bulunmakta");
            Thread.currentThread().stop();
        }
    }
}
