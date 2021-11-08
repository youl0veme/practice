package ru.ssau.tk.name.practice.exception;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.ssau.tk.name.practice.dataType.Person;

import static org.testng.Assert.*;

public class Task4_1Test {
    @Test
    public void testReturnPerson() {
        Person p = new Person("Blabla", "Bla");
        assertEquals(Task4_1.returnPerson(p), "Blabla Bla");
        Assert.assertThrows(NullPointerException.class, () -> Task4_1.returnPerson(null));
    }
}
