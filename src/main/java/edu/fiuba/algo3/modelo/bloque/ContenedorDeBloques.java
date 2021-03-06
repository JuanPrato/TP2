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

    public List<Label> vistasBloques(Stage stage){
        System.out.println(bloquesAcoplados.size());
        List<Label> bloques = new ArrayList<>();
        bloquesAcoplados.forEach(bloque -> {
            bloques.add(bloque.vista(stage));
        });
        return bloques;
    }
}
