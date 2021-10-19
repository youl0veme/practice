package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_23Test {
    @Test
    public void testChangingFirstMaxAndFirstMinElement() {
        int[] array = new int[]{2, 6, 244, -12, 4, 8, -20};
        Task2_23.changingFirstMaxAndFirstMinElement(array);
        assertEquals(array[2], -20);
        assertEquals(array[6], 244);
    }
}
