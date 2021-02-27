package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

public class Lapiz implements ILapiz{

    private IEstrategiaLapiz estrategia;

    public Lapiz(){
        estrategia = new Levantado();
    }

    @Override
    public void bajarLapiz() {
        this.estrategia = new Abajo();
    }

    @Override
    public void levantarLapiz() {
        this.estrategia = new Levantado();
    }

    @Override
    public Linea dibujar(Posicion posicionInicial, Posicion posicionFinal) {
        return estrategia.realizarLinea(posicionInicial, posicionFinal);
    }
}
