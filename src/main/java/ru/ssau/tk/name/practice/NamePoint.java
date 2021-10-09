package ru.ssau.tk.name.practice;

public class NamePoint extends Point {
    private String name;

    public NamePoint() {
        this(0, 0, 0, "Origin");
    }

    public NamePoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamePoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
