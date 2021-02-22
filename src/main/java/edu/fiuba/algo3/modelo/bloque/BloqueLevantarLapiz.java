package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueLevantarLapiz implements IBloque {

    public BloqueLevantarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo){
        sectorDibujo.actualizarLapizPersonaje(new LapizLevantado());
    }

}
