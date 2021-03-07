package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.controlador.BloqueAcopladoHandler;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class BloqueRepetir extends ContenedorDeBloques implements IBloque {
    int nRepeticiones;

    public BloqueRepetir(int repeticiones) {
        super();
        this.nRepeticiones = repeticiones;
    }

    @Override
    public void accion(SectorDibujo sectorDibujo) {
        for (int i = 0; i < nRepeticiones; i++) {
            for (IBloque bloqueActual : bloquesAcoplados) {
                bloqueActual.accion( sectorDibujo );
            }
        }
    }

    @Override
    public  void invertir() {
        for (IBloque bloqueActual : bloquesAcoplados) {
            bloqueActual.invertir();
        }
    }

    @Override
    public VBox vista(Stage stage) {
        VBox rec = new VBox();
        List<VBox> boxs = this.vistasBloques(stage);
        for (VBox box: boxs){
            box.setPadding(new Insets(0,0,0,15));
        }
        Button bloque = new Button();
        bloque.setGraphic(new ImageView
                (new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/RepetirX"+Integer.toString(nRepeticiones)+".png"))
        );
        bloque.setStyle(
                "-fx-border-color: transparent;\n" +
                "-fx-border-width: 0;\n" +
                "-fx-background-radius: 0;\n" +
                "-fx-background-color: transparent;\n" +
                "-fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "-fx-font-size: 1em; /* 12 */\n" +
                "-fx-text-fill: #828282;"
        );
        bloque.setOnAction(new BloqueAcopladoHandler(this, stage));
        rec.getChildren().add(bloque);
        rec.getChildren().addAll(boxs);
        return rec;
    }
}
