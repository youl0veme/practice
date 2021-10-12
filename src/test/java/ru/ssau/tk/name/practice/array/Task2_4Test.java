package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_4Test {
    @Test
    public void testGenerateArray() {
        int[] array = Task2_4.generateArray(5);
        assertEquals(array.length, 5);
        assertEquals(array[4], 2);
        assertEquals(array[3], 4);
        assertEquals(array[2], 6);
        assertEquals(array[1], 8);
        assertEquals(array[0], 10);
    }
}
