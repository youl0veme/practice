package ru.ssau.tk.name.practice.string;

public class Task3_5 {
    public static boolean stringComparisonIgnoreCase(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        } else return !s2.equals(s1) & s2.equalsIgnoreCase(s1);
    }
}
