package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_24Test {
    @Test
    public void testBitwiseNegation() {
        int[] array = new int[]{1, 4, 6};
        Task2_24.bitwiseNegation(array);
        assertEquals(array, new int[]{-2, -5, -7});
    }
}
