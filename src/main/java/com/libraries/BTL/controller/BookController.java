package com.libraries.BTL.controller;

import com.libraries.BTL.dto.book.BookDto;
import com.libraries.BTL.exception.NotFoundException;
import com.libraries.BTL.model.Book;
import com.libraries.BTL.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody BookDto bookDto) throws NotFoundException {
        Book book = bookService.createBook(bookDto);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }
    @GetMapping("/")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> bookList = bookService.getAllBooks();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Integer id){
        this.bookService.delete(id);
        return true;
    }
}
