package ru.ssau.tk.name.practice.dataType;

public abstract class Operation {
    public static final double DELTA = 0.001;
    abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
