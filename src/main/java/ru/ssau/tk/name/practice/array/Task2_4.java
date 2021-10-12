package ru.ssau.tk.name.practice.array;

public class Task2_4 {
    public static int[] generateArray(int size){
        int[] array = new int[size];
        for(int i=0; i< array.length;i++){
            array[i]=(size-i)*2;
        }
        return array;
    }
}
