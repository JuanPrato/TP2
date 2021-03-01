package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.vista.ContenedorVentana;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonBloqueRepetirEventHandler implements EventHandler<ActionEvent> {

    private SectorAlgoritmo sectorAlgoritmo;
    private BloqueRepetir bloqueRepetir;
    private final Stage stage;

    public BotonBloqueRepetirEventHandler(Stage stage, SectorAlgoritmo sectorAlgoritmo, BloqueRepetir bloqueRepetir) {
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.bloqueRepetir = bloqueRepetir;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.addBloque(this.bloqueRepetir);
        stage.setScene( new Scene(new ContenedorVentana(stage, sectorAlgoritmo), 1700,800));
    }
}
