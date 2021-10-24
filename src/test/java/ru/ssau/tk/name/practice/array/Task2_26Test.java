package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_26Test {
    @Test
    public void testSumElementArray() {
        assertEquals(Task2_26.sumElementArray(new int[]{1, 2, 3, 4, 5, 6}), new int[]{3, 7, 11});
        assertEquals(Task2_26.sumElementArray(new int[]{2, 3, 4, 5, 7, 3, 2, 1,}), new int[]{5, 9, 10, 3});
    }
}
