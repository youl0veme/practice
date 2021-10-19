package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_30Test {
    @Test
    public void testGenerateArray() {
        int[][] array = Task2_30.generateArray(3);
        assertEquals(array[0][0], 1);
        assertEquals(array[0][1], 2);
        assertEquals(array[0][2], 3);
        assertEquals(array[1][0], 4);
        assertEquals(array[1][1], 5);
        assertEquals(array[2][0], 6);
    }
}
