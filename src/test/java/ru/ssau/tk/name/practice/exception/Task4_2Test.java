package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {
    @Test
    public void testArrayOfCharactersByIndex() {
        assertEquals(Task4_2.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 2), new char[]{'л', 'д', 'у'});

        assertThrows(NullPointerException.class, () -> Task4_2.arrayOfCharactersByIndex(null, 2));
        assertThrows(NullPointerException.class, () -> Task4_2.arrayOfCharactersByIndex(new String[]{null, "лёд", "uheif"}, 2));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Task4_2.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, 10));
        assertThrows(StringIndexOutOfBoundsException.class, () -> Task4_2.arrayOfCharactersByIndex(new String[]{"яблоко", "лёд", "груша"}, -1));
    }
}
