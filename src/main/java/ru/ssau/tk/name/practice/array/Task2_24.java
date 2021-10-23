package ru.ssau.tk.name.practice.array;

public class Task2_24 {
    public static void bitwiseNegation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }
}
