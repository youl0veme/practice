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

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }

    Point first = new Point(1,2,3);
    Point second = new Point(2,5,1);
}
