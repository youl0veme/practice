package ru.ssau.tk.name.practice.dataType;

import org.testng.annotations.*;
import ru.ssau.tk.name.practice.dataType.IdenticalOperation;

import static org.testng.Assert.*;
import static ru.ssau.tk.name.practice.dataType.Operation.*;

public class IdenticalOperationTest {

    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(1), 1, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(3), 3, DELTA);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DELTA);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
    }
}