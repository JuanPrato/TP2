package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueBajarLapiz implements IBloque {
    private boolean inversa = false;

    public BloqueBajarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        if ( inversa ) {
            sectorDibujo.subirLapizDelPersonaje();
        } else {
            sectorDibujo.bajarLapizDelPersonaje();
        }
    }

    @Override
    public void invertir() {
        this.inversa = true;
    }
}
