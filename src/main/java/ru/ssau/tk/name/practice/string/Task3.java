package ru.ssau.tk.name.practice.string;

public class Task3 {
    public static void stringComparison() {
        String s1 = "First string!";
        String s2 = new String(s1);
        System.out.print("==: ");
        System.out.print(s1 == s2);
        System.out.print("  equals: ");
        System.out.print(s1.equals(s2));
    }
}
