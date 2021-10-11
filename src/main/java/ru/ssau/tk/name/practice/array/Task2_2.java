package ru.ssau.tk.name.practice.array;

public class Task2_2 {
    public static int[] generatedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 | i == size - 1) {
                array[i] = 1;
            } else {
                array[i] = 2;
            }
        }
        return array;
    }
}
