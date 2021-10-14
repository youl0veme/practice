package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_10Test {
    @Test
    public void testGetProgressionArray() {
        int[] array = Task2_10.getProgressionArray(5, 3, 2);
        assertEquals(array.length, 5);
        assertEquals(array[0], 3);
        assertEquals(array[1], 6);
        assertEquals(array[2], 12);
        assertEquals(array[3], 24);
        assertEquals(array[4], 48);
    }
}
