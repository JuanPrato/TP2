package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.controlador.RemoverBloqueEventHandler;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.BotonBloque;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BloquePersonalizado extends ContenedorDeBloques implements IBloque{

    static private final BloquePersonalizado instance = new BloquePersonalizado();
    public BloquePersonalizado(){
        super();
    }

    public void accion(SectorDibujo sectorDibujo){
        for (IBloque bloque:bloquesAcoplados) {
            bloque.accion(sectorDibujo);
        }
    }

    public void invertir(){
        for (IBloque bloque:bloquesAcoplados) {
            bloque.invertir();
        }
    }

    public void guardarAlgoritmo(){
        // TODO: Buscar una forma de no violar el encapsulamiento
        this.bloquesAcoplados.addAll(SectorAlgoritmo.getInstance().getBloques());
    }

    @Override
    public VBox vista(Stage stage, ContenedorDeBloques contenedorActual) {
        VBox box = new VBox();
        Label bloque = new Label();
        bloque.setGraphic(new ImageView
                (new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/RepetirBloquear.png")));
        bloque.setStyle(
                "-fx-border-color: transparent;\n" +
                        "-fx-border-width: 0;\n" +
                        "-fx-background-radius: 5;\n" +
                        "-fx-background-color: ef5ca3;\n" +
                        "-fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                        "-fx-font-size: 1em; /* 12 */\n" +
                        "-fx-text-fill: #828282;"
        );

        HBox hBox = new HBox();
        Button remove = new BotonBloque("Remover", 160, 15, 160, 20, Color.web("ef5ca3"),
                Color.web("ae3e74"), null);
        remove.setOnAction(new RemoverBloqueEventHandler(this, stage, contenedorActual));

        //Separador
        Region region = new Region();
        region.setPrefHeight(10);
        hBox.getChildren().addAll(bloque, remove);
        box.getChildren().addAll(hBox,region);
        return box;


    }

    static public BloquePersonalizado getInstance(){return instance;}
}
