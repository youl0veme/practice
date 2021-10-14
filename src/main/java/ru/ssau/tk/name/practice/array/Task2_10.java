package ru.ssau.tk.name.practice.array;

public class Task2_10 {
    public static int[] getProgressionArray(int size, int b, int q) {
        int[] array = new int[size];
        array[0] = b;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] * q;
        }
        return array;
    }
}
