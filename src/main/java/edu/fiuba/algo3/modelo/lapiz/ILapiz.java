package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

public interface ILapiz {

    Linea dibujar(Posicion posicionInicial, Posicion posicionFinal);

    void bajarLapiz();

    void levantarLapiz();

}
