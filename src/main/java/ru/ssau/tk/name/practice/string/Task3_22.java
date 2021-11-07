package ru.ssau.tk.name.practice.string;

public class Task3_22 {
    public static String createString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}
