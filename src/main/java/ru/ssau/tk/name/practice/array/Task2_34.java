package ru.ssau.tk.name.practice.array;

public class Task2_34 {
    public static double multiplyElements(double[] array) {
        double multiply = 1;
        for (double v : array) {
            if (!Double.isNaN(v) & v != Double.POSITIVE_INFINITY & v != Double.NEGATIVE_INFINITY) {
                multiply *= v;
            }
        }
        return multiply;
    }
}
