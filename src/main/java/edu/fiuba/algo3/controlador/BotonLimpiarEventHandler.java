package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.ContenedorTablero;
import edu.fiuba.algo3.vista.ContenedorVentana;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonLimpiarEventHandler implements EventHandler<ActionEvent> {

    private final Stage stage;

    public BotonLimpiarEventHandler(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        SectorAlgoritmo.getInstance().reiniciarJuego(SectorDibujo.getInstance());
        ContenedorTablero.reiniciarTablero();
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), SectorDibujo.getInstance(), SectorAlgoritmo.getInstance()));
    }
}
