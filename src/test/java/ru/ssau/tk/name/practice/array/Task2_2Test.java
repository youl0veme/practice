package ru.ssau.tk.name.practice.array;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class Task2_2Test {
    @Test
    public void testGenerateArray(){
        int[] array=Task2_2.generatedArray(4);
        assertEquals(array.length,4);
        assertEquals(array[0],1);
        assertEquals(array[1],2);
        assertEquals(array[2],2);
        assertEquals(array[3],1);
    }

}
