package edu.fiuba.algo3.modelo.bloque;

import java.util.ArrayList;
import java.util.List;

public abstract class BloqueAcoplado {
    public List<IBloque> bloquesAcoplados = new ArrayList<IBloque>();

    public BloqueAcoplado () {}

    public void agregarBloque(IBloque bloque) {
        bloquesAcoplados.add(bloque);
    }

    public void removerBloque(IBloque bloque) {
        bloquesAcoplados.remove(bloque);
    }

    public List<IBloque> getBloques() {
        return bloquesAcoplados;
    }
}
