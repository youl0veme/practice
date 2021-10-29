package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_9Test {
    @Test
    public void testIndexOfString() {
        assertEquals(Task3_9.indexOfString("ca", "acabfacac"), 1);
        assertEquals(Task3_9.indexOfString("r", "night"), -1);
    }
}
