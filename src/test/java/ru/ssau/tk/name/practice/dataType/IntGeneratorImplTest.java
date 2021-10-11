package ru.ssau.tk.name.practice.dataType;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class IntGeneratorImplTest {
    @Test
    public void testNextInt() {
        IntGenerator objectLink = new IntGeneratorImpl();
        assertEquals(objectLink.nextInt(), 0);
        objectLink.nextInt();
        objectLink.nextInt();
        assertEquals(objectLink.nextInt(), 3);
    }

}