package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_5Test {
    @Test
    public void testStringComparisonIgnoreCase() {
        assertFalse(Task3_5.stringComparisonIgnoreCase(null, "hello"));
        assertTrue(Task3_5.stringComparisonIgnoreCase("hello", "Hello"));
        assertFalse(Task3_5.stringComparisonIgnoreCase("hello", "bye"));
    }
}
