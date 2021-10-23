package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_25Test {
    @Test
    public void testBitwiseNegation() {
        int[] array = new int[]{2, 4, 6, 8};
        int[] newArray = Task2_25.bitwiseNegation(array);
        assertEquals(newArray, new int[]{-3, -5, -7, -9});
    }
}
