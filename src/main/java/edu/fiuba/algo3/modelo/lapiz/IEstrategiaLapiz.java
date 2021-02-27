package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

public interface IEstrategiaLapiz {

    Linea realizarLinea(Posicion posicionInicial, Posicion posicionFinal);

}
