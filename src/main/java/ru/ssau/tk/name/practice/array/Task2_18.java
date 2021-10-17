package ru.ssau.tk.name.practice.array;

public class Task2_18 {
    public static double getMaxElement(double[] array) {
        double max = 0;
        for (double i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
