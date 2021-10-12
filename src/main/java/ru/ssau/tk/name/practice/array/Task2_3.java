package ru.ssau.tk.name.practice.array;

public class Task2_3 {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
        }
        return array;
    }
}
