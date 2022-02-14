package Matrices;

public class Tripleta {
    private int fila;
    private int columna;
    private double dato;

    public Tripleta(int fila, int columna, double dato) {
        this.fila = fila;
        this.columna = columna;
        this.dato = dato;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public Double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }
}
