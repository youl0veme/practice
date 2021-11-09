package ru.ssau.tk.name.practice.exception;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Task4_6 {
    public static void serialization(OutputStream os, Object o) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(os);
        out.writeObject(o);
    }
}
