package ru.ssau.tk.name.practice.array;

public class Task2_20 {
    public static boolean whoHasTheMostDivisible(int[] array) {
        int divisorByFirst = 0;
        for (int j : array) {
            if (j % array[0] == 0) {
                divisorByFirst++;
            }
        }
        int notDivisorByFirst = array.length - divisorByFirst;
        return divisorByFirst > notDivisorByFirst;
    }
}
