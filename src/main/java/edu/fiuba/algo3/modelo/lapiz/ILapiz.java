package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;

public interface ILapiz {

    void dibujar(Posicion posicionInicial, Posicion posicionFinal);

    void bajarLapiz();

    void levantarLapiz();

}
