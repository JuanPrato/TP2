package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueRepetir extends BloqueAcoplado implements IBloque {
    int nRepeticiones;

    public BloqueRepetir(int repeticiones) {
        super();
        this.nRepeticiones = repeticiones;
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        for (int i = 0; i < nRepeticiones; i++) {
            for (IBloque bloqueActual : bloquesAcoplados) {
                bloqueActual.accion( sectorDibujo );
            }
        }
    }

    @Override
    public  void invertir() {
        for (IBloque bloqueActual : bloquesAcoplados) {
            bloqueActual.invertir();
        }
    }
}