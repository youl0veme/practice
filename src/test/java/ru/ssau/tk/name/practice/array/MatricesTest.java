package ru.ssau.tk.name.practice.array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class MatricesTest {
    private final double DELTA = 0.01;

    @Test
    public void testSumMatrix() {
        Matrix first = new Matrix(2, 2);
        first.setAt(0, 0, 1);
        first.setAt(0, 1, 2);
        first.setAt(1, 0, 3);
        first.setAt(1, 1, 4);

        Matrix second = new Matrix(2, 2);
        second.setAt(0, 0, 4);
        second.setAt(0, 1, 3);
        second.setAt(1, 0, 2);
        second.setAt(1, 1, 1);

        Matrix sumMatrix = Matrices.sumMatrix(first, second);

        assert sumMatrix != null;
        assertEquals(sumMatrix.getAt(0, 0), 5, DELTA);
        assertEquals(sumMatrix.getAt(0, 1), 5, DELTA);
        assertEquals(sumMatrix.getAt(1, 0), 5, DELTA);
        assertEquals(sumMatrix.getAt(1, 1), 5, DELTA);
    }

    @Test
    public void testMultiplyMatrix() {
        Matrix first = new Matrix(2, 2);
        first.setAt(0, 0, 1);
        first.setAt(0, 1, 2);
        first.setAt(1, 0, 3);
        first.setAt(1, 1, 4);

        Matrix second = new Matrix(2, 2);
        second.setAt(0, 0, 4);
        second.setAt(0, 1, 3);
        second.setAt(1, 0, 2);
        second.setAt(1, 1, 1);

        Matrix multiplyMatrix = Matrices.multiplyMatrix(first, second);

        assert multiplyMatrix != null;
        assertEquals(multiplyMatrix.getAt(0, 0), 8, DELTA);
        assertEquals(multiplyMatrix.getAt(0, 1), 5, DELTA);
        assertEquals(multiplyMatrix.getAt(1, 0), 20, DELTA);
        assertEquals(multiplyMatrix.getAt(1, 1), 13, DELTA);
    }

    @Test
    public void testMultiplyByNumber() {
        Matrix matrix = new Matrix(2, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(1, 0, 3);
        matrix.setAt(1, 1, 4);

        Matrix multiplyByNumberMatrix = Matrices.multiplyByNumber(matrix, 5);

        assertEquals(multiplyByNumberMatrix.getAt(0, 0), 5, DELTA);
        assertEquals(multiplyByNumberMatrix.getAt(0, 1), 10, DELTA);
        assertEquals(multiplyByNumberMatrix.getAt(1, 0), 15, DELTA);
        assertEquals(multiplyByNumberMatrix.getAt(1, 1), 20, DELTA);
    }

    @Test
    public void testToString() {
        Matrix first = new Matrix(2, 2);
        first.setAt(0, 0, 1);
        first.setAt(0, 1, 2);
        first.setAt(1, 0, 3);
        first.setAt(1, 1, 4);
        assertEquals(first.toString(), "1.0, 2.0;\n3.0, 4.0;\n");
    }
}
