package com.medium.libraryinfosystem.controller;

import com.medium.libraryinfosystem.dto.BookDTO;
import com.medium.libraryinfosystem.model.lombok.Book;
import com.medium.libraryinfosystem.service.BookService;
import com.medium.libraryinfosystem.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ragcrix
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/")
    public List<BookDTO> getAllBooks() {
        return ObjectMapperUtils.mapAll(bookService.findAll(), BookDTO.class);
    }


    @GetMapping(value = "/byName/{bookName}")
    public BookDTO getBookByName(@PathVariable("bookName") String bookName) {
        return ObjectMapperUtils.map(bookService.findByName(bookName), BookDTO.class);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> saveOrUpdateBook(@RequestBody BookDTO bookDTO) {
        bookService.save(ObjectMapperUtils.map(bookDTO, Book.class));
        return new ResponseEntity("Book added successfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{bookName}")
    public ResponseEntity<?> deleteBookByName(@PathVariable String bookName) {
        bookService.delete(bookService.findByName(bookName));
        return new ResponseEntity("Book deleted successfully", HttpStatus.OK);
    }


}
