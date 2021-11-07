package ru.ssau.tk.name.practice.string;

import java.nio.charset.Charset;

public class Task3_24 {
    public static String changingTheEncoding(String s, Charset c1, Charset c2) {
        return new String(s.getBytes(c1), c2);
    }
}
