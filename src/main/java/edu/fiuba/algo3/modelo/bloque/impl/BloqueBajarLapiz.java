package edu.fiuba.algo3.modelo.bloque.impl;

import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.lapiz.impl.LapizAbajo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueBajarLapiz implements IBloque {

    public BloqueBajarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sector) {
        sector.actualizarLapizPersonaje(new LapizAbajo());
    }
}
