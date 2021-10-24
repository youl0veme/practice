package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_27Test {
    @Test
    public void testBooleanArray() {
        assertEquals(Task2_27.getBooleanArray(new int[]{1, 2, 3, 4, 5, 6}), new boolean[]{false, true, false, true, false, true});
        assertEquals(Task2_27.getBooleanArray(new int[]{-2, 3, 4, -5, 6}), new boolean[]{true, false, true, false, true});
    }
}
