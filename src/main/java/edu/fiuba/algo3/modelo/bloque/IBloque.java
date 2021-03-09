package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public interface IBloque {

    void accion(SectorDibujo sector);

    void invertir();

    default VBox vista(Stage stage, ContenedorDeBloques contenedorActual){
        VBox box = new VBox(100);
        //Button b = new Button("BLOCK");
        Label b = new Label();
        box.getChildren().add(b);
        return box;
    }
}
