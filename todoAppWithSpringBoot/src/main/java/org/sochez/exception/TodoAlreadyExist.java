package org.sochez.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Responsible for handling existing todo exception.
 * @author Chukwuebuka
 * @version 1.0
 */

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Todo already exist")
public class TodoAlreadyExist extends RuntimeException{

    private static final long serialVersionUID = 1018046446580066058L;

    /**
     * constructs a new runtime exception with customized message.
     * @param message the detail message of the error.
     */

    public TodoAlreadyExist(String message) {
        super(message);
    }
}
