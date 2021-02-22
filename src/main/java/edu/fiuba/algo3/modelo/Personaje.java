package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.lapiz.Lapiz;

public class Personaje {

    private Posicion posicion = new Posicion();

    private Lapiz lapiz = new Lapiz();

    Personaje() {}

    public Lapiz getLapiz() {
        return lapiz;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void mover(Direccion direccion){
        this.posicion = direccion.proximaPosicion(this.posicion);
    }

    public void subirLapiz(){
        lapiz.levantarLapiz();
    }

    public void bajarLapiz(){
        lapiz.bajarLapiz();
    }
}
