package ru.ssau.tk.name.practice.array;

public class Task2_8 {
    public static int[] getArrayOfNaturalNumbersNotDivisibleBy3(int size) {
        int[] array = new int[size];
        int help = 0;
        for (int i = 0; array[size - 1] == 0; i++) {
            if (i % 3 == 0) {
                help++;
                continue;
            }
            array[i - help] = i;
        }
        return array;
    }
}
