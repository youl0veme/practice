package ru.ssau.tk.name.practice.array;

public class Task2_9 {
    public static int[] getProgressionArray(int size, int a, int d) {
        int[] array = new int[size];
        array[0] = a;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }
}
