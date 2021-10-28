package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_8Test {
    @Test
    public void testIndexOfString() {
        assertEquals(Task3_8.indexOfString("ac", "ababfacac"), 5);
        assertEquals(Task3_8.indexOfString("r", "night"), -1);
    }
}
