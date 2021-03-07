package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public class BloquePersonalizado extends ContenedorDeBloques implements IBloque{

    static private final BloquePersonalizado instance = new BloquePersonalizado();
    public BloquePersonalizado(){
        super();
    }

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

    public void guardarAlgoritmo(){
        // TODO: Buscar una forma de no violar el encapsulamiento
        this.bloquesAcoplados = SectorAlgoritmo.getInstance().getBloques();
    }

    static public BloquePersonalizado getInstance(){return instance;}
}
