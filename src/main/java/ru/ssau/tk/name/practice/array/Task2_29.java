package ru.ssau.tk.name.practice.array;

public class Task2_29 {
    public static double[] createFillingArray(int size, int index) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            if (i + index >= size) {
                array[i + index - size] = i + 1;
            } else {
                array[i + index] = i + 1;
            }
        }
        return array;
    }
}

