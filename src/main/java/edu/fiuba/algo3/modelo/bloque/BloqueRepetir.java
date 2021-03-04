package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class BloqueRepetir extends BloqueAcoplado implements IBloque {
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
        Button b = new Button(String.format("REPETIR %s", nRepeticiones));
        List<VBox> boxs = this.vistasBloques(stage);
        for (VBox box: boxs){
            box.setPadding(new Insets(0,0,0,15));
        }
        b.setOnAction(new BloqueAcopladoHandler(this, stage));
        rec.getChildren().add(b);
        rec.getChildren().addAll(boxs);
        return rec;
    }
}
