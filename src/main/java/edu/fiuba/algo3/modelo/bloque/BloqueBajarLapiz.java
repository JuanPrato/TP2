package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Button;
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
    public VBox vista(Stage stage) {
        VBox box = new VBox(100);
        Button b = new Button("BAJAR LAPIZ");
        box.getChildren().add(b);
        return box;
    }
}
