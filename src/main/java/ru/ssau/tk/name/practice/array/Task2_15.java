package ru.ssau.tk.name.practice.array;

public class Task2_15 {
    public static boolean searchNumber(double[] array, double number) {
        boolean search = false;
        for (double v : array) {
            search = v == number;
        }
        return search;
    }
}
