package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;

import static java.nio.charset.StandardCharsets.*;


import static ru.ssau.tk.name.practice.string.Task3_24.changingTheEncoding;

public class Task3_24Test {

    @Test
    public void testChangingTheEncoding() {
        System.out.println(changingTheEncoding("hello world", UTF_8, UTF_16));
    }
}
