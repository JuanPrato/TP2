package edu.fiuba.algo3.modelo.bloque.impl;

import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloqueMovimiento implements IBloque {

    private int desplazamientoX;
    private int desplazamientoY;

    public BloqueMovimiento() {
    }

    public BloqueMovimiento(int desplazamientoX, int desplazamientoY) {
        this.desplazamientoX = desplazamientoX;
        this.desplazamientoY = desplazamientoY;
    }

    @Override
    public void accion(SectorDibujo sector) {
        sector.actualizarPosicionPersonaje(desplazamientoX,desplazamientoY);
    }
}
