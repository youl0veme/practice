package ru.ssau.tk.name.practice.dataType;

public class NamePoint extends Point implements Resettable {
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

    public void reset() {
        this.name = "Absent";
    }

    @Override
    public String toString() {
        if (name == null) {
            return super.toString();
        }
        return name + " " + super.toString();
    }
}
