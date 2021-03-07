package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BloqueLevantarLapiz implements IBloque {
    private IUsarLapiz usoLapiz = new LevantarLapiz();

    public BloqueLevantarLapiz() {
    }

    @Override
    public void accion(SectorDibujo sectorDibujo){
        usoLapiz.usar(sectorDibujo);
    }

    @Override
    public void invertir() {
        usoLapiz = usoLapiz.inversa();
    }

    @Override
    public Label vista(Stage stage) {
        /*VBox box = new VBox(100);
        Button b = new Button("LAVANTAR LAPIZ");
        box.getChildren().add(b);
        return box;*/
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("src/main/java/edu/fiuba/algo3/vista/imagenes/LapizLevantado.png")));
        return bloque;
    }
}