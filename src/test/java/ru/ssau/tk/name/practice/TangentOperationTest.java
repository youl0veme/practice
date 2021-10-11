package ru.ssau.tk.name.practice;

import org.testng.annotations.*;
import ru.ssau.tk.name.practice.dataType.TangentOperation;

import static org.testng.Assert.*;
import static ru.ssau.tk.name.practice.dataType.Operation.DELTA;

public class TangentOperationTest {
    TangentOperation tan = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tan.apply(Math.PI / 4), 1, DELTA);
        assertEquals(tan.apply(Double.NaN), Double.NaN, DELTA);
        assertEquals(tan.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tan.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
    }

    @Test
    public void testTriple() {
        assertEquals(tan.applyTriple(Math.PI / 4), Math.tan(Math.tan(1)), DELTA);
        assertEquals(tan.applyTriple(Double.NaN), Double.NaN, DELTA);
        assertEquals(tan.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tan.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
    }
}
