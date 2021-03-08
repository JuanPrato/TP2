package edu.fiuba.algo3.modelo.bloque;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public abstract class ContenedorDeBloques {
    protected List<IBloque> bloquesAcoplados = new ArrayList<IBloque>();

    public ContenedorDeBloques() {}

    public void agregarBloque(IBloque bloque) {
        bloquesAcoplados.add(bloque);
    }

    public void removerBloque(IBloque bloque) {
        bloquesAcoplados.remove(bloque);
    }

    public List<IBloque> getBloques() {
        return bloquesAcoplados;
    }

    public List<VBox> vistasBloques(Stage stage, ContenedorDeBloques contenedorActual){
        System.out.println(bloquesAcoplados.size());
        List<VBox> bloques = new ArrayList<>();
        bloquesAcoplados.forEach(bloque -> {
            bloques.add(bloque.vista(stage, contenedorActual));
        });
        return bloques;
    }

    public void removerUltimo(){
        bloquesAcoplados.remove(bloquesAcoplados.size()-1);
    };
}
