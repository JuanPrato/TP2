package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class LevantarLapiz extends UsarLapiz {

    @Override
    public void usar(SectorDibujo sectorDibujo) {
        sectorDibujo.subirLapizDelPersonaje();
    }
}