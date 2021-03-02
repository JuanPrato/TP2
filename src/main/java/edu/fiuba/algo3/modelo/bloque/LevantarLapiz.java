package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class LevantarLapiz implements IUsarLapiz {

    @Override
    public void usar(SectorDibujo sectorDibujo) {
        sectorDibujo.subirLapizDelPersonaje();
    }

    @Override
    public BajarLapiz inversa(){
        return new BajarLapiz();
    }
}