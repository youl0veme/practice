package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_17Test {
    @Test
    public void testGetNumberOfEven() {
        assertEquals(Task2_17.getNumberOfEven(new int[]{1, 2, 3, 4, 5}), 2);
        assertEquals(Task2_17.getNumberOfEven(new int[]{2, 2, 2, 4}), 4);
        assertEquals(Task2_17.getNumberOfEven(new int[]{1, 3, 5}), 0);
    }
}
