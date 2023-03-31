package com.demo.aspectprogramming.exception;

public class ReadOnlyException extends Throwable {
    public ReadOnlyException(Exception e) {
        super(e);
    }

    public ReadOnlyException(String message) {
        super(message);
    }
}
