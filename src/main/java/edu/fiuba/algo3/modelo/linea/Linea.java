package edu.fiuba.algo3.modelo.linea;

import edu.fiuba.algo3.modelo.Posicion;

public class Linea {

    private Posicion posicionInicial;

    private Posicion posicionFinal;

    public Linea(Posicion posicionInicial, Posicion posicionFinal){
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public Posicion getPosicionInicial() {
        return posicionInicial;
    }

    public void setPosicionInicial(Posicion posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    public Posicion getPosicionFinal() {
        return posicionFinal;
    }

    public void dibujarse(){

    }
}
