package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.controlador.RemoverBloqueEventHandler;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.BotonBloque;
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
    public VBox vista(Stage stage, ContenedorDeBloques contenedorActual) {
        VBox box = new VBox();
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/LapizAbajo.png")));
        //Button b = new Button("BAJAR LAPIZ");
        bloque.setStyle(
                "-fx-background-radius: 5;\n" +
                        "-fx-background-color: #00bb2d;\n"
        );
        HBox hBox = new HBox();
        Button remove = new BotonBloque(null, 10, 10, 10, 5, Color.web("ffffff"),
                Color.web("FFA3A3"), (new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/delete.png")));
        remove.setOnAction(new RemoverBloqueEventHandler(this, stage, contenedorActual));
        //Separador
        Region region = new Region();
        region.setPrefHeight(10);
        hBox.getChildren().addAll(bloque, remove);
        box.getChildren().addAll(hBox,region);
        return box;
    }
}
