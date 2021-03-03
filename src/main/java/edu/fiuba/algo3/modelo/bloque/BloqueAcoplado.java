package edu.fiuba.algo3.modelo.bloque;

import javafx.scene.control.Button;
import javafx.stage.Stage;

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

    public List<Button> vistasBloques(Stage stage){
        System.out.println(bloquesAcoplados.size());
        List<Button> boxes = new ArrayList<>();
        bloquesAcoplados.forEach(bloque -> {
            boxes.add(0, bloque.vista(stage));
        });
        return boxes;
    }
}
