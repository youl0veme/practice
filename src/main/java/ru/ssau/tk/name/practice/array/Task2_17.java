package ru.ssau.tk.name.practice.array;

public class Task2_17 {
    public static int getNumberOfEven(int[] array) {
        int even = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}
