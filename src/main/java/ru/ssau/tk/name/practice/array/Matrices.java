package ru.ssau.tk.name.practice.array;

public class Matrices {
    public static Matrix sumMatrix(Matrix first, Matrix second) {
        if (first.getNSize() != second.getNSize() | first.getMSize() != second.getMSize()) {
            return null;
        }
        Matrix sumMatrix = new Matrix(first.getNSize(), second.getMSize());
        for (int i = 0; i < sumMatrix.getNSize(); i++) {
            for (int j = 0; j < sumMatrix.getMSize(); j++) {
                double sum = first.getAt(i, j) + second.getAt(i, j);
                sumMatrix.setAt(i, j, sum);
            }
        }
        return sumMatrix;
    }

    public static Matrix multiplyMatrix(Matrix first, Matrix second) {
        if (first.getMSize() != second.getNSize()) {
            return null;
        }
        Matrix multMatrix = new Matrix(first.getNSize(), second.getMSize());
        for (int i = 0; i < multMatrix.getNSize(); ++i) {
            for (int j = 0; j < multMatrix.getMSize(); ++j) {
                double multi = 0;
                for (int k = 0; k < first.getMSize(); ++k) {
                    multi += first.getAt(i, k) * second.getAt(k, j);
                    multMatrix.setAt(i, j, multi);

                }

            }
        }
        return multMatrix;
    }

    public static Matrix multiplyByNumber(Matrix matrix, double number) {
        Matrix multiplyByNumberMatrix = new Matrix(matrix.getNSize(), matrix.getMSize());
        for (int i = 0; i < multiplyByNumberMatrix.getNSize(); i++) {
            for (int j = 0; j < multiplyByNumberMatrix.getMSize(); j++) {
                double multiNumber = matrix.getAt(i, j) * number;
                multiplyByNumberMatrix.setAt(i, j, multiNumber);
            }
        }
        return multiplyByNumberMatrix;
    }

}
