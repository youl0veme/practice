package ru.ssau.tk.name.practice.dataType;

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
