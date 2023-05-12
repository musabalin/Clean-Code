package org.example.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author musa.balin
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String nationalityId;
    List<Book> books;

}
