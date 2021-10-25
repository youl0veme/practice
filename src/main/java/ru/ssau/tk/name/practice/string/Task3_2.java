package ru.ssau.tk.name.practice.string;

public class Task3_2 {
    public static void printByte(String s) {
        byte[] array = s.getBytes();
        for (byte i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
