package org.example.entities.concretes;

import lombok.Getter;
import lombok.Setter;

/**
 * @author musa.balin
 */

//Single Responsibility Principle
@Getter
@Setter
public class Book {
    private int id;
    private String name;
    private Author author;
    private int pageCount;
}
//Naming conventions
/*
 * Classes => PascalCase
 * Methods, Variables => camelCase
 * Constants => UPPER_CASE
 * Package => lower case
 *
 *
 * */
