package ru.ssau.tk.name.practice.dataType;

import ru.ssau.tk.name.practice.dataType.Operation;

public class SqrtOperation extends Operation {
    @Override
    double apply(double number) {
        return Math.sqrt(number);
    }
}
