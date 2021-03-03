package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.IBloque;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;

import java.util.ArrayList;
import java.util.List;


public class SectorAlgoritmo extends BloqueAcoplado {

    static private final SectorAlgoritmo sectorAlgoritmoInst = new SectorAlgoritmo();

    private SectorAlgoritmo() {
        super();
    }

    /*public void addBloque(IBloque bloque){
       bloques.add(bloque);
    }*/

    public void ejecutarAlgoritmo(SectorDibujo sectorDibujo) {
        this.bloquesAcoplados.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });
    }

    public void reiniciarJuego(SectorDibujo sectorDibujo) {
        sectorDibujo.limpiarTablero();
        this.bloquesAcoplados = new ArrayList<IBloque>();
    }

    static public SectorAlgoritmo getInstance(){
        return sectorAlgoritmoInst;
    }

}