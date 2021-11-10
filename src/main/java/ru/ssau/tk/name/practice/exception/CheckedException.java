package ru.ssau.tk.name.practice.exception;

public class CheckedException extends RuntimeException {
    public static void throwCheckedException() throws CheckedException {
        throw new CheckedException();
    }

    public static CheckedException throwUncheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            throw new UncheckedException(e);
        }
        return null;
    }
}
