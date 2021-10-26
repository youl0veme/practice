package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task3_4Test {
    @Test
    public void testPalindrome() {
        assertTrue(Task3_4.palindrome("level"));
        assertFalse(Task3_4.palindrome("Не палиндром"));
    }
}
