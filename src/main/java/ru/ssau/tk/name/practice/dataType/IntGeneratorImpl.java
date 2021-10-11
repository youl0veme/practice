package ru.ssau.tk.name.practice.dataType;

import ru.ssau.tk.name.practice.dataType.IntGenerator;

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
