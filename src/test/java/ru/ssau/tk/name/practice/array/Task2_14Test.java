package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_14Test {
    @Test
    public void testOppositeArray() {
        int[] array = new int[]{1, 2, -3, 4};
        Task2_14.oppositeArray(array);
        assertEquals(array[0], -1);
        assertEquals(array[1], -2);
        assertEquals(array[2], 3);
        assertEquals(array[3], -4);
    }
}
