package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static ru.ssau.tk.name.practice.exception.CheckedException.throwCheckedException;

public class CheckedExceptionTest {
    @Test
    public void testThrowCheckedException() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            e.getCause();
        }
    }
}
