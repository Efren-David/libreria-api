package com.edgv.library_api_sec.Service;

import com.edgv.library_api_sec.Entity.Book;
import com.edgv.library_api_sec.Exception.BookNotFoundException;
import org.springframework.context.annotation.Bean;

import java.util.List;


public interface BookService {

    List<Book> findAll();
    Book findById(Long id) throws BookNotFoundException;
    Book findByTitle(String title);
    List<Book> findByAuthor(String author);

    Book addBook(Book book);
    Book editBook(Long id, Book book);
    void removeBook(Long id) throws BookNotFoundException;

}
