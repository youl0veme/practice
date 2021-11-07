package ru.ssau.tk.name.practice.string;

public class Task3_21 {
    public static String createStringBuilder(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); ++i) {
            if (i % 2 == 0) {
                stringBuilder.replace(i, i + 1, Integer.toString(i));
            }
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
