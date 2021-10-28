package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_7Test {
    @Test
    public void testIndexOfString() {
        assertEquals(Task3_7.indexOfString("ca", "abcaca"), 2);
        assertEquals(Task3_7.indexOfString("p", "abcaba"), -1);
    }
}
