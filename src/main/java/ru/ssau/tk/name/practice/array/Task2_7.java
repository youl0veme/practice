package ru.ssau.tk.name.practice.array;

public class Task2_7 {

    public static double[] getSolvingTheQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        } else {
            if (b == 0) {
                return new double[]{-Math.sqrt(-c), Math.sqrt(-c)};
            } else {
                if (c == 0) {
                    return new double[]{0, -b / a};
                } else {
                    double discriminant = (b * b) - (4 * a * c);
                    return new double[]{(-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a)};
                }
            }
        }
    }
}
