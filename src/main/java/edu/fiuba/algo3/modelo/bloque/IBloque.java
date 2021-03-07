package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public interface IBloque {

    void accion(SectorDibujo sector);

    void invertir();

    default Label vista(Stage stage){
        //VBox box = new VBox(100);
        //Button b = new Button("BLOCK");
        //box.getChildren().add(b);
        return new Label();
    }
}
