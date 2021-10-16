package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_13Test {
    @Test
    public void testGenerationArray() {
        int[] array = Task2_13.generationArray(6);
        assertEquals(array.length, 6);
        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 3);
        assertEquals(array[3], 3);
        assertEquals(array[4], 2);
        assertEquals(array[5], 1);
    }
}
