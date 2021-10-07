package ru.ssau.tk.name.practice;

import org.testng.annotations.*;

import static org.testng.Assert.*;
import static ru.ssau.tk.name.practice.Points.equalsApproximately;


public class PointsTest {

    @Test
    public void testsSum() {
        assertTrue(equalsApproximately(Points.sum(new Point(1., -2., 3.), new Point(2., -4., -1.)), new Point(3., -6., 2.)));
        assertTrue(equalsApproximately(Points.sum(new Point(0., 0.5, -4.5), new Point(-1., -0.5, 5)), new Point(-1., 0., 0.5)));
    }

    @Test
    public void testSubtract(){
        assertTrue(equalsApproximately(Points.subtract(new Point(-1.,3.,5.),new Point(1.,1.,1.)),new Point(-2.,2.,4)));
        assertTrue(equalsApproximately(Points.subtract(new Point(-3.,1.5,6.),new Point(-1.,1.,2.)),new Point(-2.,0.5,4)));
    }
}
