package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
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
        bloque.setStyle(
                        "-fx-background-radius: 5;\n" +
                        "-fx-background-color: #00adbc;\n"
        );
        //Separador
        Region region = new Region();
        region.setPrefHeight(10);
        box.getChildren().addAll(bloque,region);
        return box;
    }
}
