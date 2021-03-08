package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.controlador.BloqueAcopladoHandler;
import edu.fiuba.algo3.controlador.RemoverBloqueEventHandler;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.BotonBloque;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class BloqueInvertir extends ContenedorDeBloques implements IBloque {

    public BloqueInvertir () {
        super();
    }

    @Override
    public void agregarBloque(IBloque bloque) {
        bloque.invertir();
        bloquesAcoplados.add(bloque);
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        for (IBloque bloqueActual : bloquesAcoplados) {
            bloqueActual.accion( sectorDibujo );
        }
    }

    @Override
    public void invertir() {
        for (IBloque bloqueActual : bloquesAcoplados) {
            bloqueActual.invertir();
        }
    }

    @Override
    public VBox vista(Stage stage, ContenedorDeBloques contenedorActual) {
        VBox rec = new VBox();
        List<VBox> boxs = this.vistasBloques(stage, contenedorActual);
        for (VBox box: boxs){
            box.setPadding(new Insets(0,0,0,10));
        }
        Button bloque = new Button();
        bloque.setStyle(
                "-fx-background-radius: 5;\n" +
                        "-fx-background-color: #fcdd2a;\n"
        );
        bloque.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Invertir.png")));
        bloque.setOnAction(new BloqueAcopladoHandler(this, stage));

        HBox hBox = new HBox();
        Button remove = new BotonBloque("Remover", 160, 15, 160, 20, Color.web("ef5ca3"),
                Color.web("ae3e74"), null);
        remove.setOnAction(new RemoverBloqueEventHandler(this, stage, contenedorActual));

        //Separador
        Region region = new Region();
        region.setPrefHeight(10);
        hBox.getChildren().addAll(bloque, remove);
        rec.getChildren().addAll(hBox,region);
        rec.getChildren().addAll(boxs);
        return rec;
    }
}
