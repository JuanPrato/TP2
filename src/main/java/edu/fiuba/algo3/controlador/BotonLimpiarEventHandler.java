package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.vista.ContenedorVentana;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonLimpiarEventHandler implements EventHandler<ActionEvent> {

    private Stage stage;
    private SectorAlgoritmo sectorAlgoritmo;

    public BotonLimpiarEventHandler(Stage stage, SectorAlgoritmo sectorAlgoritmo) {
        this.stage = stage;
        this.sectorAlgoritmo = sectorAlgoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.reiniciarJuego();
        stage.setScene(new Scene(new ContenedorVentana(stage, sectorAlgoritmo), 1700, 800));
    }
}
