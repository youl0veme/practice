package ru.ssau.tk.name.practice.dataType;

import ru.ssau.tk.name.practice.dataType.Operation;

public class TangentOperation extends Operation {
    @Override
    double apply(double number) {
        return Math.tan(number);
    }
}
