package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BajarLapiz extends UsarLapiz {

    @Override
    public void usar(SectorDibujo sectorDibujo) {
        sectorDibujo.bajarLapizDelPersonaje();
    }
}