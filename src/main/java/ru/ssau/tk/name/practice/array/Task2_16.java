package ru.ssau.tk.name.practice.array;

public class Task2_16 {
    public static  boolean searchNull(Integer[] array){
        boolean search=false;
        for (Integer integer : array) {
            if (integer == null) {
                search = true;
                return search;
            }
        }
        return search;
    }
}
