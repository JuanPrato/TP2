package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BajarLapiz implements IUsarLapiz {

    @Override
    public void usar(SectorDibujo sectorDibujo) {
        sectorDibujo.bajarLapizDelPersonaje();
    }

    @Override
    public LevantarLapiz inversa(){
        return new LevantarLapiz();
    }
}