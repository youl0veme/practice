package ru.ssau.tk.name.practice.array;

public class Task2_30 {
    public static int[][] generateArray(int size) {
        int[][] array = new int[size][];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[size - i];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
        return array;
    }
}
