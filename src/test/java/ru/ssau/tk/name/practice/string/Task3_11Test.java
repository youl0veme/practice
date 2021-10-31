package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_11Test {
    @Test
    public void testNumberOfStringArray() {
        String[] array = new String[]{"abcd", "peach", "tomato", "good"};
        assertEquals(Task3_11.numberOfStringArray(array, "a", "d"), 1);
        assertEquals(Task3_11.numberOfStringArray(array, "t", "o"), 1);
    }
}
