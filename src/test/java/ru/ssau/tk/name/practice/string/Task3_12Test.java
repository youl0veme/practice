package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_12Test {
    @Test
    public void testSet() {
        String s = Task3_12.set("ороророро", "оро", "ро");
        assertEquals(s, "роррро");
    }
}