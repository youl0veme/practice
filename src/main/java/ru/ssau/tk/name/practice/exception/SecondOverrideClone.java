package ru.ssau.tk.name.practice.exception;

public class SecondOverrideClone implements Cloneable {
    public int x;

    public SecondOverrideClone(int x) {
        this.x = x;
    }

    @Override
    public SecondOverrideClone clone() throws CloneNotSupportedException {
        return (SecondOverrideClone) super.clone();
    }
}
