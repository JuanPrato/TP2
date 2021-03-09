package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.IBloque;

import java.util.ArrayList;


public class SectorAlgoritmo extends ContenedorDeBloques {

    static private final SectorAlgoritmo sectorAlgoritmoInst = new SectorAlgoritmo();

    private SectorAlgoritmo() {
        super();
    }


    public void ejecutarAlgoritmo(SectorDibujo sectorDibujo) {
        this.bloquesAcoplados.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });
    }

    public void reiniciarJuego(SectorDibujo sectorDibujo) {
        sectorDibujo.reiniciarTablero();
        this.bloquesAcoplados = new ArrayList<IBloque>();
    }

    public void limpiarTablero(SectorDibujo sectorDibujo){
        sectorDibujo.reiniciarTablero();
    }

    static public SectorAlgoritmo getInstance(){
        return sectorAlgoritmoInst;
    }

}