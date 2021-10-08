package ru.ssau.tk.name.practice;

public abstract class Operation {
    abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
