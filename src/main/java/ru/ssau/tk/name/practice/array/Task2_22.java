package ru.ssau.tk.name.practice.array;

public class Task2_22 {
    public static int indexOfNumber(int[] array, int number) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == number) {
                break;
            }
        }
        return i;
    }
}
