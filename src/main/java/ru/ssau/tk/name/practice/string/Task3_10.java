package ru.ssau.tk.name.practice.string;

public class Task3_10 {
    public static int getPrefixPostfixCount(String[] s, String prefix, String postfix) {
        int count = 0;
        for (String value : s) {
            if (value.startsWith(prefix) & value.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}
