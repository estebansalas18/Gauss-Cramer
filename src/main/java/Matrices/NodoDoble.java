package Matrices;

public class NodoDoble {
    private NodoDoble ligaDerecha;
    private NodoDoble ligaIzquierda;
    private Object valor;

    public NodoDoble(Object valor) {
        this.valor = valor;
    }

    public Object getLigaDerecha() {
        return ligaDerecha;
    }

    public void setLigaDerecha(NodoDoble ligaDerecha) {
        this.ligaDerecha = ligaDerecha;
    }

    public Object getLigaIzquierda() {
        return ligaIzquierda;
    }

    public void setLigaIzquierda(NodoDoble ligaIzquierda) {
        this.ligaIzquierda = ligaIzquierda;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
