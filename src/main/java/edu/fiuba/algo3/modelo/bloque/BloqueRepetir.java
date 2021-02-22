package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;

public class BloqueRepetir extends BloqueAcoplado implements IBloque {
    int repeticiones;

    public BloqueRepetir(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public void accion(Personaje personaje) {}
}
