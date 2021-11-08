package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_4Test {
    @Test
    public void testDivisionString() {
        assertEquals(Task4_4.divisionString("12", "4"), 3);
        assertThrows(ArithmeticException.class, () -> Task4_4.divisionString("123", "0"));
        assertThrows(NumberFormatException.class, () -> Task4_4.divisionString("hello", "10"));
    }
}
