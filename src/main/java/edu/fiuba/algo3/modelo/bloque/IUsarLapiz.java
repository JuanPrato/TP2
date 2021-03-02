package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public interface IUsarLapiz {
    void usar(SectorDibujo sectorDibujo);

    IUsarLapiz inversa();
}
