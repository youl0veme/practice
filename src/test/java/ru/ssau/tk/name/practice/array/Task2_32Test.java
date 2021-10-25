package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_32Test {
    private static final double DELTA = 0.01;

    @Test
    public void testSearchNaN() {
        double[] array = new double[]{10, 23, 9, 1};
        double[] arrayNaN = new double[]{Double.NaN, 4, 1};
        Task2_32.searchNaN(array);
        Task2_32.searchNaN(arrayNaN);

        assertEquals(array[0], 1, DELTA);
        assertEquals(array[1], 9, DELTA);
        assertEquals(array[2], 10, DELTA);
        assertEquals(array[3], 23, DELTA);
        assertEquals(arrayNaN[0], Double.NaN, DELTA);
        assertEquals(arrayNaN[1], 4, DELTA);
    }
}
