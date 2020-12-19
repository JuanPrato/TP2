package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.lapiz.ILapiz;
import edu.fiuba.algo3.modelo.lapiz.impl.LapizLevantado;

public class Personaje {

    Posicion posicion = new Posicion();

    ILapiz ILapiz = new LapizLevantado();

    Personaje() {}

    Personaje(ILapiz ILapiz) {
        this.ILapiz = ILapiz;
    }

    public ILapiz getLapiz() {
        return ILapiz;
    }

    public void setLapiz(ILapiz ILapiz) {
        this.ILapiz = ILapiz;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void mover(int desplazamientoX, int desplazamientoY){
        posicion.mover(desplazamientoX,desplazamientoY);
    }
}
