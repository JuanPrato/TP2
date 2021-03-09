package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import edu.fiuba.algo3.vista.TableroVista;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonReiniciarEventHandler implements EventHandler<ActionEvent> {

    private final Stage stage;

    public BotonReiniciarEventHandler(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        SectorAlgoritmo.getInstance().reiniciarJuego(SectorDibujo.getInstance());
        TableroVista.reiniciarTablero();
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), SectorDibujo.getInstance(), SectorAlgoritmo.getInstance()));
    }
}
