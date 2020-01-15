package com.medium.libraryinfosystem.service.impl;

import com.medium.libraryinfosystem.model.lombok.Book;
import com.medium.libraryinfosystem.repository.BookRepository;
import com.medium.libraryinfosystem.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ragcrix
 */
@Slf4j
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book findByName(String name) {
        log.info("inside findByName()");
        return bookRepository.findByName(name);
    }

    @Override
    public List<Book> findAll() {
        log.info("inside findAll()");
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        log.info("inside save()");
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        log.info("inside delete()");
        bookRepository.delete(book);
    }


}
