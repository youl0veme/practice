package ru.ssau.tk.name.practice.string;

public class Task3_19 {
    public static String[] splitString(String s) {
        String[] array = s.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == 1) {
                array[i] = array[i].toUpperCase();
            } else {
                array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
            }
        }
        return array;
    }
}
