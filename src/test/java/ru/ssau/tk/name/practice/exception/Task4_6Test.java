package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;
import ru.ssau.tk.name.practice.dataType.Person;

import java.io.*;

import static org.testng.Assert.*;

import static ru.ssau.tk.name.practice.exception.Task4_6.serialization;

public class Task4_6Test {
    @Test
    public void testSerialization() {
        try {
            Person person = new Person("BlaBla", "Bla", 1234567);
            serialization(new ByteArrayOutputStream(), person);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertThrows(FileNotFoundException.class, () -> serialization(new FileOutputStream(""), new Person()));
        assertThrows(NotSerializableException.class, () -> serialization(new ByteArrayOutputStream(), new Object()));
    }
}
