package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Direccion;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMovimiento implements IBloque {
    Direccion direccion;

    Posicion posicion = new Posicion();

    public BloqueMovimiento() {
    }

    public BloqueMovimiento(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public void accion(Personaje personaje) {
        personaje.mover( direccion );
    }
}
