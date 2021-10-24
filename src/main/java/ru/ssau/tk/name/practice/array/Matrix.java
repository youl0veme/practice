package ru.ssau.tk.name.practice.array;

public class Matrix {
    private final double[][] matrix;
    private final int nSize;
    private final int mSize;

    public Matrix(int nSize, int mSize) {
        this.nSize = nSize;
        this.mSize = mSize;
        matrix = new double[nSize][mSize];
    }

    public int getMSize() {
        return mSize;
    }

    public int getNSize() {
        return nSize;
    }

    public double getAt(int nSize, int mSize) {
        return matrix[nSize][mSize];
    }

    public void setAt(int n, int m, double values) {
        matrix[n][m] = values;
    }
}
