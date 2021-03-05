package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloquePersonalizado extends ContenedorDeBloques implements IBloque{

    public void accion(SectorDibujo sectorDibujo){
        for (IBloque bloque:bloquesAcoplados) {
            bloque.accion(sectorDibujo);
        }
    }

    public void invertir(){
        for (IBloque bloque:bloquesAcoplados) {
            bloque.invertir();
        }
    }
}
