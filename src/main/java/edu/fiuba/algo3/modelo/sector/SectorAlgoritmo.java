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
    private final SectorDibujo sectorDibujo;
    private SectorBloque sectorBloque;
    private List<IBloque> bloques;

    public SectorAlgoritmo() {
        this.bloques = new ArrayList<IBloque>();
        this.sectorDibujo = new SectorDibujo();
    }

    public void addBloque(IBloque bloque){
        bloques.add(bloque);
    }

    public List<Button> vistasBloques(){
        System.out.println(bloques.size());
        List<Button> boxes = new ArrayList<>();
        bloques.forEach(bloque -> {
            boxes.add(0, bloque.vista());
        });
        return boxes;
    }

    public void ejecutarAlgoritmo() {
        this.bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });
    }

    public void reiniciarJuego() {
        sectorDibujo.limpiarTablero();
        this.bloques = new ArrayList<IBloque>();
    }

    public SectorDibujo getSectorDibujo(){
        return this.sectorDibujo;
    }
}