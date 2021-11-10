package ru.ssau.tk.name.practice.exception;

public class UncheckedException extends RuntimeException {
    public UncheckedException(CheckedException e) {
        super(e);
    }
}
