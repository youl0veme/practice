package ru.ssau.tk.name.practice.string;

public class Task3_13 {
    public static String subString(String s, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > s.length()) {
            to = s.length();
        }
        if (to <= from) {
            return "";
        }
        return s.substring(from, to);
    }
}
