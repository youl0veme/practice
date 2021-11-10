package ru.ssau.tk.name.practice.exception;

public class IncompatibleDimensionsException extends RuntimeException {
    private static final long serialVersionUID = -771644709540662669L;

    public IncompatibleDimensionsException() {
        this("Матрицы не совместимы");
    }

    public IncompatibleDimensionsException(String message) {
        super(message);
    }

}
