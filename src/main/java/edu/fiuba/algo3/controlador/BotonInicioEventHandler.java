package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.ContenedorVentana;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonInicioEventHandler implements EventHandler<ActionEvent> {
    Stage stage;

    public BotonInicioEventHandler(Stage stage) {
        super();
        this.stage = stage;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), SectorDibujo.getInstance(), SectorAlgoritmo.getInstance()));
        stage.setMaximized(true);
    }
}