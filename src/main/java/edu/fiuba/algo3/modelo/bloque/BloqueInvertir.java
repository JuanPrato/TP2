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
    public Label vista(Stage stage) {
        /*VBox rec = new VBox();
        Button b = new Button("INVERTIR");
        List<VBox> boxs = this.vistasBloques(stage);
        for (VBox box: boxs){
            box.setPadding(new Insets(0,0,0,15));
        }
        b.setOnAction(new BloqueAcopladoHandler(this, stage));
        rec.getChildren().add(b);
        rec.getChildren().addAll(boxs);
        return rec;*/
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("src/main/java/edu/fiuba/algo3/vista/imagenes/Invertir.png")));
        return bloque;
    }
}
