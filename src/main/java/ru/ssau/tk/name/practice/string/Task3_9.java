package ru.ssau.tk.name.practice.string;

public class Task3_9 {
    public static int indexOfString(String s1, String s2) {
        return s2.lastIndexOf(s1, s2.length() / 2);
    }
}
