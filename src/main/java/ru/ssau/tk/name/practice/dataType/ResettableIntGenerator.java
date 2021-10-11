package ru.ssau.tk.name.practice.dataType;

import ru.ssau.tk.name.practice.dataType.IntGenerator;
import ru.ssau.tk.name.practice.dataType.Resettable;

public class ResettableIntGenerator implements IntGenerator, Resettable {
    private int numberOfCalls = 0;

    @Override
    public int nextInt() {
        return numberOfCalls++;
    }

    @Override
    public void reset() {
        this.numberOfCalls = 0;
    }
}
