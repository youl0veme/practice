package ru.ssau.tk.name.practice.exception;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SecondOverrideCloneTest {
    @Test
    public void testClone() {
        try {
            SecondOverrideClone object = new SecondOverrideClone(1);
            SecondOverrideClone cloneObject = object.clone();
            System.out.println("Object:" + object);
            System.out.println("Clone object:" + cloneObject);
            assertEquals(cloneObject.x, object.x);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
