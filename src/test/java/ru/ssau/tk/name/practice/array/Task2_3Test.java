package ru.ssau.tk.name.practice.array;

import static org.testng.Assert.*;

import org.testng.annotations.*;

public class Task2_3Test {
    @Test
    public void testGenerateArray() {
        int[] array = Task2_3.generateArray(4);
        assertEquals(array.length, 4);
        assertEquals(array[0], 1);
        assertEquals(array[1], 3);
        assertEquals(array[2], 5);
        assertEquals(array[3], 7);
    }
}
