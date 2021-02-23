package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueLevantarLapiz implements IBloque {
    private boolean inversa = false;

    public BloqueLevantarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo){
        if ( inversa ) {
            sectorDibujo.bajarLapizDelPersonaje();
        } else {
            sectorDibujo.subirLapizDelPersonaje();
        }
    }

    @Override
    public void invertir() {
        this.inversa = true;
    }
}
