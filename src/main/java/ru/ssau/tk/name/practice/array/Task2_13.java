package ru.ssau.tk.name.practice.array;

public class Task2_13 {
    public static int[] generationArray(int size) {
        int[] array = new int[size];
        int j = 1;
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            if (i <= (size - 1) / 2) {
                array[i] = number;
                number++;
            } else {
                array[i] = number - j;
                j++;
            }
        }
        return array;
    }
}

