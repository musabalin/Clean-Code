package org.example;

import org.example.entities.concretes.Author;
import org.example.entities.concretes.Book;
import org.example.repositories.concretes.InMemoryAuthorRepository;
import org.example.services.abstacts.AuthorService;
import org.example.services.concretes.AuthorManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author musa.balin
 */
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setId(1);
        author1.setAge(25);
        author1.setNationalityId("1111111");
        author1.setName("Balın");
        author1.setName("Musa");


        Book book1 = new Book();
        book1.setPageCount(198);
        book1.setId(1);
        book1.setAuthor(author1);
        book1.setName("Kaybolan Yıllar");

        List<Book> books = new ArrayList<>();
        books.add(book1);

        AuthorService authorService = new AuthorManager(new InMemoryAuthorRepository());

        Author author2=new Author(1,"Ahmet","Yaşa",11,"12233333",books);

        authorService.add(author1);
       // authorService.add(author1);
        authorService.add(author2);
        for (Author author: authorService.getAll()){
            System.out.println(author.getName());
        }


    }
}