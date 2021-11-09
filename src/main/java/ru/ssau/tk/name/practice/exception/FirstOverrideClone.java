package ru.ssau.tk.name.practice.exception;

public class FirstOverrideClone {
    public int x;

    public FirstOverrideClone(int x) {
        this.x = x;
    }

    @Override
    public FirstOverrideClone clone() throws CloneNotSupportedException {
        return (FirstOverrideClone) super.clone();
    }
}
