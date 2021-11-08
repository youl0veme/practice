package ru.ssau.tk.name.practice.exception;

public class Task4_2 {
    public static char[] arrayOfCharactersByIndex(String[] array, int n) {
        char[] c = new char[array.length];
        for (int i = 0; i < c.length; ++i) {
            c[i] = array[i].charAt(n);
        }
        return c;
    }
}
