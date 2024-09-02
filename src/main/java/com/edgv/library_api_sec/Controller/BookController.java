package com.edgv.library_api_sec.Controller;


import com.edgv.library_api_sec.Entity.Book;
import com.edgv.library_api_sec.Exception.BookNotFoundException;
import com.edgv.library_api_sec.Exception.ErrorResponse;
import com.edgv.library_api_sec.Service.BookService;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> books = bookService.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping(value = "/books/{id}")
    public Book getBook(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }

    @GetMapping(value = {"/books/{bookId}/authors"})
    public String getAuthors(@PathVariable(required = false)String bookId){
        if (bookId== null)
            return "no bookId";
        return "author";
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> modifyBook(@PathVariable Long id, @RequestBody Book book) throws BookNotFoundException{
        Book newBook = bookService.editBook(id, book);
        return ResponseEntity.ok(newBook);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable Long id) throws BookNotFoundException{
        bookService.removeBook(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleBookNotFoundException(BookNotFoundException bnfe) {
        ErrorResponse errorResponse = new ErrorResponse(100, bnfe.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }


}
