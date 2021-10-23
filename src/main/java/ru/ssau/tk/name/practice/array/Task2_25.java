package ru.ssau.tk.name.practice.array;

import java.util.Arrays;

public class Task2_25 {
    public static int[] bitwiseNegation(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            newArray[i] = ~newArray[i];
        }
        return newArray;
    }
}
