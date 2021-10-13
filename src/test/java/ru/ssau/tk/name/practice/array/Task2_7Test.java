package ru.ssau.tk.name.practice.array;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_7Test {
    private static final double DELTA = 0.01;

    @Test
    public void testGetSolvingTheQuadraticEquation() {
        double[] first = Task2_7.getSolvingTheQuadraticEquation(1., 3., 1.);
        double[] second = Task2_7.getSolvingTheQuadraticEquation(1., 0., -3.);
        double[] third = Task2_7.getSolvingTheQuadraticEquation(0., 2, 9);
        double[] fourth = Task2_7.getSolvingTheQuadraticEquation(2., -4., 0);
        assertEquals(first.length, 2);
        assertEquals(second.length, 2);
        assertEquals(third.length, 1);
        assertEquals(fourth.length, 2);
        assertEquals(first[0], -0.382, DELTA);
        assertEquals(first[1], -2.618, DELTA);
        assertEquals(second[0], -1.732, DELTA);
        assertEquals(second[1], 1.732, DELTA);
        assertEquals(third[0], -4.5, DELTA);
        assertEquals(fourth[0], 0., DELTA);
        assertEquals(fourth[1], 2, DELTA);
    }
}
