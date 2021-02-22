package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.direccion.Direccion;

public class Posicion {

    private int posicionX;

    private int posicionY;

    //Se hace de esta forma para que se instacie en una forma valida de usar
    public Posicion() {
        posicionX = 0;
        posicionY = 0;
    }

    public Posicion(int x, int y) {
        posicionX = x;
        posicionY = y;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

}
