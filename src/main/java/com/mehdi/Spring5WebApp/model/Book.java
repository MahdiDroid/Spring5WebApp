package com.mehdi.Spring5WebApp.model;

import java.util.HashSet;
import java.util.Set;

public class Book {
    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();
}
