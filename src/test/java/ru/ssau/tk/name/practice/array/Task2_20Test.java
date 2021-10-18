package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_20Test {
    @Test
    public void testWhoHasTheMostDivisible() {
        assertTrue(Task2_20.whoHasTheMostDivisible(new int[]{5, 4, 25, 30, 5}));
        assertFalse(Task2_20.whoHasTheMostDivisible(new int[]{3, 7, 8, 9, 10}));
    }
}
