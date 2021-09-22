package ru.ssau.tk.name.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    Point first = new Point(1,2,3);
    Point second = new Point(2,5,1);
}
