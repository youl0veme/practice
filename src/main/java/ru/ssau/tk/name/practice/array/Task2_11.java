package ru.ssau.tk.name.practice.array;

public class Task2_11 {
    public static int[] getDivisorArray(int number) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) numberOfDivisors++;
        }
        int[] array = new int[numberOfDivisors];
        int j = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                array[j++] = i;
            }
        }
        return array;
    }
}
