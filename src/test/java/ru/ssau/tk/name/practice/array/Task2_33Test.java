package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task2_33Test {
    @Test
    public void testPrintStringArray() {
        String[] array = new String[]{"Hello", ",", "world", "!"};
        Task2_33.printStringArray(array);
    }
}
