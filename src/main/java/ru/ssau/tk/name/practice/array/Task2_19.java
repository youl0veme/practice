package ru.ssau.tk.name.practice.array;

public class Task2_19 {
    public static int getSumOfEvenNumber(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
