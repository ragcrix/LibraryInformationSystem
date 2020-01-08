package com.medium.libraryinfosystem.repository;

import com.medium.libraryinfosystem.model.lombok.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author ragcrix
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByName(String name);

    List<Book> findAll();

    Book save(Book book);

    void delete(Book book);
}
