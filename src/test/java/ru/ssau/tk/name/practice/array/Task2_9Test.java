package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_9Test {
    @Test
    public void testGetProgressionArray() {
        int[] array = Task2_9.getProgressionArray(5, 1, 3);
        assertEquals(array.length, 5);
        assertEquals(array[0], 1);
        assertEquals(array[1], 4);
        assertEquals(array[2], 7);
        assertEquals(array[3], 10);
        assertEquals(array[4], 13);
    }
}
