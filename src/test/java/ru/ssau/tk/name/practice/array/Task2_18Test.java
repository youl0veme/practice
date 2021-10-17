package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_18Test {
    private static final double DELTA = 0.01;

    @Test
    public void testGetMaxElement() {
        assertEquals(Task2_18.getMaxElement(new double[]{1, 2, 3, 5, 2}), 5, DELTA);
        assertEquals(Task2_18.getMaxElement(new double[]{}), 0, DELTA);
    }
}
