package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.IBloque;


public class SectorAlgoritmo extends BloqueAcoplado {
    private SectorDibujo sectorDibujo;
    private SectorBloque sectorBloque;

    public SectorAlgoritmo(SectorDibujo unSectorDibujo) {
        this.sectorDibujo = unSectorDibujo;
    }

    public void ejecutarAlgoritmo() {
        sectorBloque.ejecutarSecuenciaBLoques( sectorDibujo );
    }
}