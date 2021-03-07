package edu.fiuba.algo3.modelo;

public class Posicion {

    private int posicionX;

    private int posicionY;

    //Se hace de esta forma para que se instacie en una forma valida de usar
    public Posicion() {
        posicionX = 0;
        posicionY = 0;
    }

    public Posicion(int x, int y) {
        this.posicionX = x;
        this.posicionY = y;
    }

    public int getPosicionX() {
        return this.posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return this.posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }

        if (!(o instanceof Posicion)){
            return false;
        }

        Posicion p = (Posicion) o;

        return this.posicionX == p.getPosicionX() && this.posicionY == p.getPosicionY();
    }

}
