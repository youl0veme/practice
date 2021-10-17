package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_19Test {
    @Test
    public void testGetSumOfEvenNumber() {
        assertEquals(Task2_19.getSumOfEvenNumber(new int[]{1, 2, 3, 4, 5, 6}), 8);
        assertEquals(Task2_19.getSumOfEvenNumber(new int[]{}), 0);
        assertEquals(Task2_19.getSumOfEvenNumber(new int[]{2, 3, 6, 2, 1, 8, -10}), -3);
    }
}
