package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_20Test {
    @Test
    public void testConcatenationString() {
        assertEquals(Task3_20.concatenationString(new String[]{"hello", "world"}), "hello, world");
        assertEquals(Task3_20.concatenationString(new String[]{"apple", "orange", "banana"}), "apple, orange, banana");
    }
}
