package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_5Test {
    @Test
    public void testGenerateFibonachchi() {
        int[] array = Task2_5.generateFibonachchi(6);
        assertEquals(array.length, 6);
        assertEquals(array[0], 0);
        assertEquals(array[1], 1);
        assertEquals(array[2], 1);
        assertEquals(array[3], 2);
        assertEquals(array[4], 3);
        assertEquals(array[5], 5);
    }
}
