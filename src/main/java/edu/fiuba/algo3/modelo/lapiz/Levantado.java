package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

public class Levantado implements IEstadoLapiz{

    @Override
    public Linea realizarLinea(Posicion posicionInicial, Posicion posicionFinal) {
        return new Linea(new Posicion(), new Posicion());
    }
}
