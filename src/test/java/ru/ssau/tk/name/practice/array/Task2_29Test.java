package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_29Test {
    @Test
    public void testCreateFillingArray() {
        assertEquals(Task2_29.createFillingArray(5, 3), new double[]{3., 4., 5., 1., 2.});
    }
}
