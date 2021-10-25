package ru.ssau.tk.name.practice.array;

public class Task2_32 {
    public static void searchNaN(double[] array) {
        for (double v : array) {
            if (Double.isNaN(v)) {
                return;
            } else {
                java.util.Arrays.sort(array);
            }
        }
    }
}
