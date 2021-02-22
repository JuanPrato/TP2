package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueLevantarLapiz implements IBloque {

    public BloqueLevantarLapiz() {
    }

    @Override
    public void accion(Personaje personaje){
        personaje.levantarLapiz();
    }

}
