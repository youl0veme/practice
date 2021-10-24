package ru.ssau.tk.name.practice.array;

public class Task2_26 {
    public static int[] sumElementArray(int[] array) {
        int[] sumElementArray = new int[(array.length / 2) + (array.length % 2)];

        if (array.length % 2 == 0) {
            for (int i = 0; i < sumElementArray.length; i++) {
                sumElementArray[i] = array[2 * i] + array[2 * i + 1];
            }
        } else {
            for (int i = 0; i < sumElementArray.length - 1; i++) {
                sumElementArray[i] = array[2 * i] + array[2 * i + 1];
            }
            sumElementArray[sumElementArray.length - 1] = array[array.length - 1];
        }
        return sumElementArray;
    }


}
