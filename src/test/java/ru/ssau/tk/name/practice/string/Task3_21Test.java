package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_21Test {
    @Test
    public void testCreateStringBuilder() {
        assertEquals(Task3_21.createStringBuilder("hello"), "4l2e0");
    }
}
