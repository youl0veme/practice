package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class Task2_15Test {
    public void testSearchNumber() {
        double[] array = new double[]{1., 2., 4., 6.};
        assertTrue(Task2_15.searchNumber(array, 6.));
        assertFalse(Task2_15.searchNumber(array, 5.));
        assertFalse(Task2_15.searchNumber(array, 3.));
    }

}
