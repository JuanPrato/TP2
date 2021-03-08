package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BloqueBajarLapiz implements IBloque {
    private IUsarLapiz usoLapiz = new BajarLapiz();

    public BloqueBajarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        usoLapiz.usar(sectorDibujo);
    }

    @Override
    public void invertir() {
        usoLapiz = usoLapiz.inversa();
    }

    @Override
    public VBox vista(Stage stage) {
        VBox box = new VBox();
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/LapizAbajo.png")));
        //Button b = new Button("BAJAR LAPIZ");
        bloque.setStyle(
                "-fx-background-radius: 5;\n" +
                        "-fx-background-color: #00bb2d;\n"
        );
        //Separador
        Region region = new Region();
        region.setPrefHeight(10);
        box.getChildren().addAll(bloque,region);
        return box;
    }
}
