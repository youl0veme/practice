package ru.ssau.tk.name.practice.array;

public class Task2_27 {
    public static boolean[] getBooleanArray(int[] array) {
        boolean[] booleanArray = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            booleanArray[i] = array[i] % 2 == 0;
        }
        return booleanArray;
    }
}
