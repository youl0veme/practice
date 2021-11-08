package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_3Test {
    @Test
    public void testCharOfIndex() {
        String[] array = new String[]{"hello", "world"};
        assertEquals(Task4_3.charOfIndex(array, 1, 1), 'o');
        assertThrows(IndexOutOfBoundsException.class, () -> Task4_3.charOfIndex(array, 2, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> Task4_3.charOfIndex(array, 1, 10));
    }
}
