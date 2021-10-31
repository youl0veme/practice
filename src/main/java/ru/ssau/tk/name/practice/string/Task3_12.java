package ru.ssau.tk.name.practice.string;

public class Task3_12 {
    public static String set(String s1, String s2, String s3) {
        for (int i = 0; i < 100 && s1.contains(s2); i++) {
            s1 = s1.replaceAll(s2, s3);
        }
        return s1;
    }
}
