package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;
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
    public Label vista(Stage stage) {
        /*VBox box = new VBox(100);
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("src/main/java/edu/fiuba/algo3/vista/imagenes/LapizAbajo.png")));
        //Button b = new Button("BAJAR LAPIZ");
        box.getChildren().add(bloque);
        return box;*/
        Label bloque = new Label();
        bloque.setGraphic(new ImageView(new Image("src/main/java/edu/fiuba/algo3/vista/imagenes/LapizAbajo.png")));
        return bloque;
    }
}
