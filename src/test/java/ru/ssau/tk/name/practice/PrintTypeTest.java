package ru.ssau.tk.name.practice;

import org.testng.annotations.*;

public class PrintTypeTest {
    @Test
    public void testPrintType() {
        PrintType.printType("temp");
        PrintType.printType('w');
        PrintType.printType((byte) 2);
        PrintType.printType((short) 1);
        PrintType.printType(1.);
        PrintType.printType(22L);
        PrintType.printType(6.6f);
        PrintType.printType(1);
        PrintType.printType(true);
        PrintType.printType(new Person());
        PrintType.printType(new Point(0, 0, 0));
        PrintType.printType(null);
    }
}
