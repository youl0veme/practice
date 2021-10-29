package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_10Test {
    @Test
    public void testGetPrefixPostfixCount() {
        String[] s = new String[]{"12865da", "net8", "1da"};
        assertEquals(Task3_10.getPrefixPostfixCount(s, "1", "da"), 2);
    }
}
