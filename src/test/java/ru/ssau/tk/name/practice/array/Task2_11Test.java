package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_11Test {
    @Test
    public void testGetDivisorArray() {
        int[] array = Task2_11.getDivisorArray(100);
        assertEquals(array.length, 5);
        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 4);
        assertEquals(array[3], 5);
        assertEquals(array[4], 10);
    }

}
