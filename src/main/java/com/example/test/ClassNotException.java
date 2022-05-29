package com.example.test;

public class ClassNotException extends Exception{
    public ClassNotException() {
        super();
    }

    public ClassNotException(String message) {
        super(message);
    }

    public ClassNotException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClassNotException(Throwable cause) {
        super(cause);
    }

    protected ClassNotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
