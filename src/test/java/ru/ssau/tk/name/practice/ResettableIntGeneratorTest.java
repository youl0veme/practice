package ru.ssau.tk.name.practice;

import org.testng.annotations.Test;
import ru.ssau.tk.name.practice.dataType.IntGenerator;
import ru.ssau.tk.name.practice.dataType.Resettable;
import ru.ssau.tk.name.practice.dataType.ResettableIntGenerator;

import static org.testng.Assert.*;


public class ResettableIntGeneratorTest {
    @Test
    public void testNextInt() {
        IntGenerator objectLink = new ResettableIntGenerator();
        assertEquals(objectLink.nextInt(), 0);
        objectLink.nextInt();
        objectLink.nextInt();
        assertEquals(objectLink.nextInt(), 3);
    }

    @Test
    public void testReset() {
        Resettable firstObjectLink = new ResettableIntGenerator();
        IntGenerator secondObjectLink = (IntGenerator) firstObjectLink;
        assertEquals(secondObjectLink.nextInt(), 0);
        secondObjectLink.nextInt();
        secondObjectLink.nextInt();
        assertEquals(secondObjectLink.nextInt(), 3);
        firstObjectLink.reset();
        assertEquals(secondObjectLink.nextInt(), 0);
    }
}
