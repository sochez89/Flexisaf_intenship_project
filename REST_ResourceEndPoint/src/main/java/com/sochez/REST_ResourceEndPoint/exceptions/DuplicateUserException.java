package com.sochez.REST_ResourceEndPoint.exceptions;

// custom exception for scenarios where there i duplicate user

public class DuplicateUserException extends RuntimeException{
    public DuplicateUserException(String message){
        super(message);
    }

    public DuplicateUserException(String message, Throwable cause){
        super(message, cause);
    }
}
