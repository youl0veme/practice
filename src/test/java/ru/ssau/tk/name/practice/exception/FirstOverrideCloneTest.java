package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FirstOverrideCloneTest {
    @Test
    public void testClone() {
        try {
            FirstOverrideClone object = new FirstOverrideClone(1);
            FirstOverrideClone cloneObject = object.clone();
            System.out.println("Object:" + object);
            System.out.println("Clone object:" + cloneObject);
            assertEquals(cloneObject.x, object.x);
        } catch (CloneNotSupportedException e) { //поймано исключение
            e.printStackTrace();
        }
    }
}
