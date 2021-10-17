package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_16Test {
    @Test
    public void testSearchNull() {
        assertTrue(Task2_16.searchNull(new Integer[]{1, 3, null}));
        assertFalse(Task2_16.searchNull(new Integer[]{1, 2, 34}));
    }
}
