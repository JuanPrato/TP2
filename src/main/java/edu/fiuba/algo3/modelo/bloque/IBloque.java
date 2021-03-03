package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public interface IBloque {

    void accion(SectorDibujo sector);

    void invertir();

    default Button vista(Stage stage){
        return new Button("BLOCK");
    }
}
