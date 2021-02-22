package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.lapiz.EstadoLapizAbajo;
import edu.fiuba.algo3.modelo.lapiz.IEstadoLapiz;
import edu.fiuba.algo3.modelo.lapiz.EstadoLapizLevantado;

public class Personaje {

    Posicion posicion = new Posicion();

    IEstadoLapiz IEstadoLapiz = new EstadoLapizLevantado();

    Personaje() {}

    Personaje(IEstadoLapiz IEstadoLapiz) {
        this.IEstadoLapiz = IEstadoLapiz;
    }

    public IEstadoLapiz getLapiz() {
        return IEstadoLapiz;
    }

    public void levantarLapiz() {
        this.IEstadoLapiz = new EstadoLapizLevantado();
    }

    public void bajarLapiz() { this.IEstadoLapiz = new EstadoLapizAbajo(); }

    public Posicion getPosicion() {
        return this.posicion;
    }

    public void mover(Direccion direccion) {
        this.IEstadoLapiz.dibujar();
        this.posicion = this.posicion.moverHasta(direccion);
    }
}
