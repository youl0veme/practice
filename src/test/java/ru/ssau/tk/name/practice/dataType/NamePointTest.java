package ru.ssau.tk.name.practice.dataType;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamePointTest {
    @Test
    public void testGetName() {
        NamePoint first = new NamePoint();
        NamePoint second = new NamePoint(1., 2., 3.);
        NamePoint third = new NamePoint(1, 3, 5, "Point");

        assertEquals(first.getName(), "Origin");
        assertNull(second.getName());
        assertEquals(third.getName(), "Point");

    }

    @Test
    public void testSetName() {
        NamePoint first = new NamePoint(1, 3, 9);
        first.setName("Point1");
        NamePoint second = new NamePoint(5, 34, 1);
        second.setName("Point2");
        assertEquals(first.getName(), "Point1");
        assertEquals(second.getName(), "Point2");
    }

    @Test
    public void testReset() {
        NamePoint first = new NamePoint(1, 3, 9);
        first.reset();
        assertEquals(first.getName(), "Absent");
    }

    @Test
    public void testToString() {
        NamePoint first = new NamePoint(4, 6, 8);
        NamePoint second = new NamePoint(1, 2, 3, "Point");
        assertEquals(first.toString(), "[4.0, 6.0, 8.0]");
        assertEquals(second.toString(), "Point [1.0, 2.0, 3.0]");
    }
}
