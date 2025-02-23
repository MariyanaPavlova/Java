package com.pragmatic.lesson8.exceptions;

public class NotEnoughMemoryException extends Exception {
    public NotEnoughMemoryException() {
    }

    public NotEnoughMemoryException(String message) {
        super(message);
    }

    public NotEnoughMemoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughMemoryException(Throwable cause) {
        super(cause);
    }

    public NotEnoughMemoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
