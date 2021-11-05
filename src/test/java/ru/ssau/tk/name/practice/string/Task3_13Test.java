package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_13Test {
    @Test
    public void testSubString() {
        assertEquals(Task3_13.subString("abcde", 3, 4), "d");
        assertEquals(Task3_13.subString("abcde", -3, 4), "abcd");
        assertEquals(Task3_13.subString("abcde", 2, 10), "cde");
        assertEquals(Task3_13.subString("abcde", 4, 2), "");
    }
}
