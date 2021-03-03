package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BloqueRepetirHandler implements EventHandler<ActionEvent> {

    private final BloqueAcoplado bloqueAcoplado;
    private final Stage stage;
    public BloqueRepetirHandler(BloqueAcoplado bloque, Stage stage){
        this.bloqueAcoplado = bloque;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(SceneUtil.getScene(stage, bloqueAcoplado, SectorDibujo.getInstance()));

    }
}
