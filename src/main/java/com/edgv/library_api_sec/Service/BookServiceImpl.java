package com.edgv.library_api_sec.Service;

import com.edgv.library_api_sec.Entity.Book;
import com.edgv.library_api_sec.Exception.BookNotFoundException;
import com.edgv.library_api_sec.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;


    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) throws BookNotFoundException {
        return bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book editBook(Long id, Book book) {
        return null;
    }

    @Override
    public void removeBook(Long id) throws BookNotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book noy found"));

    }
}
