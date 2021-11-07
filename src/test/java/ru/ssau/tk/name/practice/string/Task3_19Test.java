package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_19Test {
    @Test
    public void testSplitString() {
        assertEquals(Task3_19.splitString("hello world"), new String[]{"Hello", "World"});
    }
}
