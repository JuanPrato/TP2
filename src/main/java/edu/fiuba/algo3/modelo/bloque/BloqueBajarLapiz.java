package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueBajarLapiz implements IBloque {
    private IUsarLapiz usoLapiz = new BajarLapiz();

    public BloqueBajarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        usoLapiz.usar(sectorDibujo);
    }

    @Override
    public void invertir() {
        usoLapiz = usoLapiz.inversa();
    }
}
