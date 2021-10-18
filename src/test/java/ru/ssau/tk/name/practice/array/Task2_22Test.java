package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_22Test {
    @Test
    public void testIndexOfNumber() {
        assertEquals(Task2_22.indexOfNumber(new int[]{2, 3, -4, 8}, -4), 2);
        assertEquals(Task2_22.indexOfNumber(new int[]{3, 85, 42, 4, 32, 54, 32}, 32), 4);
    }

}
