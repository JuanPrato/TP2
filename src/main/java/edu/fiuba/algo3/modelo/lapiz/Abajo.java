package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.linea.LineaVisible;

public class Abajo implements IEstrategiaLapiz {

    @Override
    public Linea realizarLinea(Posicion posicionInicial, Posicion posicionFinal) {
        return new LineaVisible(posicionInicial, posicionFinal);
    }
}
