package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueBajarLapiz implements IBloque {

    @Override
    public void accion(Personaje personaje) {
        personaje.bajarLapiz();
    }
}
