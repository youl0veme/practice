package ru.ssau.tk.name.practice.string;

public class Task3_6 {
    public static void screening() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);//табуляция
        System.out.println("Символ\b№" + ++i);//удаление последнего символа
        System.out.println("Символ\n№" + ++i);//переход на новую строку
        System.out.println("Символ\r№" + ++i);//заменяет предыдущий текст на следующий
        System.out.println("Символ\'№" + ++i);//добавляет '
        System.out.println("Символ\"№" + ++i);//добавляет "
        System.out.println("Символ\\№" + ++i);//добавляет \

    }
}
