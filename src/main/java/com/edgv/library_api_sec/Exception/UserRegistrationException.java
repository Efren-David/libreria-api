package com.edgv.library_api_sec.Exception;

public class UserRegistrationException extends Exception{

    public UserRegistrationException(){
        super();
    }

    public UserRegistrationException(String message){
        super(message);
    }
}
