package org.sochez.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Responsible for handling todo not found exception
 * @author Chukwuebuka
 * @version 1.0
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Todo Not Found")
public class TodoNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -6737867389727735801L;

    /**
     * Constructs a new runtime exception with customized message
     * @param message detail of the message of the error
     */

    public TodoNotFoundException(String message) {
        super(message);
    }
}
