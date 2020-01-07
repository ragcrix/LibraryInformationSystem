package com.medium.libraryinfosystem.service;

import com.medium.libraryinfosystem.model.Book;

import java.util.List;

/**
 * @author ragcrix
 */
public interface BookService {
    Book findByName(String name);

    List<Book> findAll();

    Book save(Book book);

    void delete(Book book);
}
