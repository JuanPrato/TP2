package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
        Label bloque = new Label();
        bloque.setGraphic(new ImageView
                (new Image
                        ("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Bloque"+this.direccion.direccionToString()+".png")));
        box.getChildren().add(bloque);
        return box;
    }
}
