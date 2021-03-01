package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;

public interface IBloque {

    void accion(SectorDibujo sector);

    void invertir();

    default Button vista(){
        return new Button("BLOCK");
    }
}
