package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_8Test {
    @Test
    public void testGetArrayOfNaturalNumbersNotDivisibleBy3() {
        int[] array = Task2_8.getArrayOfNaturalNumbersNotDivisibleBy3(6);
        assertEquals(array.length, 6);
        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 4);
        assertEquals(array[3], 5);
        assertEquals(array[4], 7);
    }
}
