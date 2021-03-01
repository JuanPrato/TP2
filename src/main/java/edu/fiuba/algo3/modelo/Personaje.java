package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.lapiz.Lapiz;
import edu.fiuba.algo3.modelo.linea.Linea;

public class Personaje {

    private Posicion posicion = new Posicion();

    private final Lapiz lapiz = new Lapiz();

    public Personaje() {}

    public Lapiz getLapiz() {
        return lapiz;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Linea moverYDibujar(Direccion direccion){
        Posicion posicionAnterior = this.posicion;
        this.posicion = direccion.proximaPosicion(this.posicion);

        return lapiz.dibujar(posicionAnterior, this.posicion);
    }

    public void subirLapiz(){
        lapiz.levantarLapiz();
    }

    public void bajarLapiz(){
        lapiz.bajarLapiz();
    }
}
