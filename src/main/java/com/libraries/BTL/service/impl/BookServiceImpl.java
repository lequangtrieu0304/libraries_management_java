package com.libraries.BTL.service.impl;

import com.libraries.BTL.dto.book.BookDto;
import com.libraries.BTL.exception.NotFoundException;
import com.libraries.BTL.model.Book;
import com.libraries.BTL.model.Category;
import com.libraries.BTL.repository.BookRepository;
import com.libraries.BTL.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CategoryServiceImpl categoryServiceImpl;
    public Book createBook(BookDto bookDto) throws NotFoundException {
        Category category = categoryServiceImpl.findById(bookDto.getCategory_id());

        Book newBook = new Book();
        newBook.setNameBook(bookDto.getName());
        newBook.setNameAuthor(bookDto.getAuthor());
        newBook.setPublishingCompany(bookDto.getPublishingCompany());
        newBook.setPublishingYear(bookDto.getPublishingYear());
        newBook.setQuantity(bookDto.getQuantity());
        newBook.setCategory(category);
        return bookRepository.save(newBook);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        this.bookRepository.deleteById(id);
    }
}
