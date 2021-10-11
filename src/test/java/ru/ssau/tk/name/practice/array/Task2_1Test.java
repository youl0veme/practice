package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_1Test {
    @Test
    public void testSetNumber() {
        int[] firstArray = Task2_1.setNumber(6);
        int[] secondArray = Task2_1.setNumber(12);
        assertEquals(firstArray.length, 6);
        assertEquals(secondArray.length, 12);
    }

}
