package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueMovimiento implements IBloque {

    Direccion direccion;

    public BloqueMovimiento() {
    }

    public BloqueMovimiento(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public void accion(SectorDibujo sector) {
        sector.actualizarPosicionPersonaje(direccion);
    }
}
