package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BloqueMovimiento implements IBloque {

    Direccion direccion;

    public BloqueMovimiento() {
    }

    public BloqueMovimiento(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public void accion(SectorDibujo sector) {
        sector.actualizarPosicionPersonaje(direccion);
    }

    @Override
    public void invertir() {
        this.direccion = direccion.inversa();
    }

    @Override
    public VBox vista(Stage stage) {
        VBox box = new VBox();
        Button b = new Button(direccion.direccionToString());
        box.getChildren().add(b);
        return box;
    }
}
