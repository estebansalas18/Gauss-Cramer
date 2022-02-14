package Matrices;

public class MatrizForma2 extends javax.swing.JFrame{
    private NodoDoble mat;

    //Constructor
    public MatrizForma2(int filas, int columnas) {
        Tripleta tripleta = new Tripleta(filas, columnas, 0);
        mat = new NodoDoble(tripleta);
        Tripleta tripleta2 = new Tripleta(0, 0, 0);
        NodoDoble nodoDoble = new NodoDoble(tripleta2);
        nodoDoble.setLigaDerecha(nodoDoble);
        nodoDoble.setLigaIzquierda(nodoDoble);
        mat.setLigaDerecha(nodoDoble);
    }

    public NodoDoble getNodoCabeza() {
        return (NodoDoble) mat.getLigaDerecha();
    }

    public NodoDoble getPrimerNodo() {
        return mat;
    }

    //Metodos

    public boolean esVacia() {
        NodoDoble p = (NodoDoble) mat.getLigaDerecha();
        return (p.getLigaIzquierda() == p && p.getLigaDerecha() == p);
    }

    public boolean finDeRecorrido(NodoDoble p) {
        return p == getNodoCabeza();
    }

    public void conectar(NodoDoble x){

        this.conectarEnFilas(x);
        this.conectarEnColumnas(x);
    }

    private void conectarEnFilas(NodoDoble x) {

        Tripleta tripletaNodox = (Tripleta) x.getValor();
        NodoDoble nodoCabeza = this.getNodoCabeza();
        NodoDoble anterior = nodoCabeza;
        NodoDoble actual = (NodoDoble) nodoCabeza.getLigaDerecha();
        Tripleta tripletaActual = (Tripleta) actual.getValor();

        while (actual != nodoCabeza && tripletaActual.getFila() < tripletaNodox.getFila()) {
            anterior = actual;
            actual = (NodoDoble) actual.getLigaDerecha();
            tripletaActual = (Tripleta) actual.getValor();
        }

        while (actual != nodoCabeza && tripletaActual.getFila() == tripletaNodox.getFila() && tripletaActual.getColumna() < tripletaNodox.getColumna()) {
            anterior = actual;
            actual = (NodoDoble) actual.getLigaDerecha();
            tripletaActual = (Tripleta) actual.getValor();
        }

        anterior.setLigaDerecha(x);
        x.setLigaDerecha(actual);
    }

    private void conectarEnColumnas(NodoDoble x) {

        Tripleta tripletaNodox = (Tripleta) x.getValor();
        NodoDoble nodoCabeza = this.getNodoCabeza();
        NodoDoble anterior = nodoCabeza;
        NodoDoble actual = (NodoDoble) nodoCabeza.getLigaIzquierda();
        Tripleta tripletaActual = (Tripleta) actual.getValor();

        while (actual != nodoCabeza && tripletaActual.getColumna() < tripletaNodox.getColumna()) {
            anterior = actual;
            actual = (NodoDoble) actual.getLigaIzquierda();
            tripletaActual = (Tripleta) actual.getValor();
        }

        while (actual != nodoCabeza && tripletaActual.getColumna() == tripletaNodox.getColumna() && tripletaActual.getFila() < tripletaNodox.getFila()) {
            anterior = actual;
            actual = (NodoDoble) actual.getLigaDerecha();
            tripletaActual = (Tripleta) actual.getValor();
        }

        anterior.setLigaIzquierda(x);
        x.setLigaIzquierda(actual);
    }
    
    public String mostrar(){
        String matriz = "";
        NodoDoble puntero = (NodoDoble) this.getNodoCabeza().getLigaDerecha();
        Tripleta t = (Tripleta) mat.getValor();
        int filas = t.getFila();
        int columnas = t.getColumna();
        for(int i = 1; i <= filas; i++) {
            matriz += "\n";
            for (int j = 1; j <= columnas; j++) {
                t = (Tripleta) puntero.getValor();
                if(i == t.getFila() && j == t.getColumna()) {
                    matriz += t.getDato() + " ";
                    puntero = (NodoDoble) puntero.getLigaDerecha();
                } 
                else{
                    matriz += "0" + " ";
                }
            }
        }
        matriz += "\n";
        return matriz;
    }
    
    public Tripleta buscar(int filas, int columnas){
        NodoDoble puntero = (NodoDoble) this.getNodoCabeza().getLigaDerecha();
        Tripleta t;
        for(int i = 1; i < 4; i++){
            for(int j = 1; j < 5; j++){
                t = (Tripleta) puntero.getValor();
                if((i == filas) && (j == columnas)){
                    return t;
                }
                puntero = (NodoDoble) puntero.getLigaDerecha();
            }
        }
        return null;
    }
    
    public void ingresar(int filas, int columnas, double dato){
        NodoDoble puntero = (NodoDoble) this.getNodoCabeza().getLigaDerecha();
        Tripleta t;
        for (int i = 1; i < 4; i++){
            for (int j = 1; j < 5; j++){
                t = (Tripleta) puntero.getValor();
                if((i ==  filas) && (j == columnas)){
                    t.setDato(dato);
                }
                puntero = (NodoDoble) puntero.getLigaDerecha();
            }
        }
    }
}