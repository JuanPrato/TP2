package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

public class Abajo implements IEstadoLapiz{

    @Override
    public Linea realizarLinea(Posicion posicionInicial, Posicion posicionFinal) {
        return new Linea(posicionInicial, posicionFinal);
    }
}
