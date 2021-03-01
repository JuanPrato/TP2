package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.vista.ContenedorVentana;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonBloqueDireccionEventHandler implements EventHandler<ActionEvent> {

    private final SectorAlgoritmo sectorAlgoritmo;
    private final Direccion direccion;
    private final Stage stage;

    public BotonBloqueDireccionEventHandler(Stage stage, SectorAlgoritmo sectorAlgoritmo, Direccion bloque){
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.direccion = bloque;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.addBloque(new BloqueMovimiento(direccion));
        stage.setScene( new Scene(new ContenedorVentana(stage, sectorAlgoritmo), 1700,800));
    }
}