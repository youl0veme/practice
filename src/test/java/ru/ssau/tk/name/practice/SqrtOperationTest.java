package ru.ssau.tk.name.practice;

import org.testng.annotations.*;
import ru.ssau.tk.name.practice.dataType.SqrtOperation;

import static org.testng.Assert.*;
import static ru.ssau.tk.name.practice.dataType.Operation.DELTA;

public class SqrtOperationTest {
    SqrtOperation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(4), 2, DELTA);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(256), 2, DELTA);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN, DELTA);
    }
}
