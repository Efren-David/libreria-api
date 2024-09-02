package com.edgv.library_api_sec.Exception;

public class BookNotFoundException extends Exception{

    public BookNotFoundException(String message){
        super(message);
    }

    public BookNotFoundException(){
        super("Book not found");
    }
}
