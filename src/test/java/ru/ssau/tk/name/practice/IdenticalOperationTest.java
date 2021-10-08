package ru.ssau.tk.name.practice;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    private static final double DELTA = 0.001;
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(1), 1, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN,DELTA);
    }
}