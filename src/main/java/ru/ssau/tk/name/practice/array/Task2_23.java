package ru.ssau.tk.name.practice.array;

public class Task2_23 {
    public static void changingFirstMaxAndFirstMinElement(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            min = Math.min(j, min);
            max = Math.max(j, max);
        }
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            }
            if (array[i] == max) {
                indexMax = i;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
    }
}
