package com.libraries.BTL.service;

import com.libraries.BTL.dto.book.BookDto;
import com.libraries.BTL.model.Book;

import java.util.List;

public interface BookService {
    Book createBook(BookDto bookDto);
    List<Book> getAllBooks();
    void delete(Integer id);
}
