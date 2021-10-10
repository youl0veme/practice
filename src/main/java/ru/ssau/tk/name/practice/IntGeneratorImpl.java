package ru.ssau.tk.name.practice;

public class IntGeneratorImpl implements IntGenerator {
    public int numberOfCalls;

    public IntGeneratorImpl() {
        this.numberOfCalls = 0;
    }

    @Override
    public int nextInt() {
        return numberOfCalls++;
    }
}
