package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_34Test {
    private static final double DELTA = 0.01;

    @Test
    public void testMultiplyElements() {
        assertEquals(Task2_34.multiplyElements(new double[]{1, 3, 8, Double.POSITIVE_INFINITY}), 24, DELTA);
        assertEquals(Task2_34.multiplyElements(new double[]{Double.NaN, 1.6, 6.4, 7}), 71.68, DELTA);
    }
}
