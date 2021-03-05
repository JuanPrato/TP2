package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonBloqueDireccionEventHandler implements EventHandler<ActionEvent> {

    private final ContenedorDeBloques sectorAlgoritmo;
    private final SectorDibujo sectorDibujo;
    private final Direccion direccion;
    private final Stage stage;

    public BotonBloqueDireccionEventHandler(Stage stage, ContenedorDeBloques sectorAlgoritmo, SectorDibujo sectorDibujo, Direccion bloque){
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.direccion = bloque;
        this.stage = stage;
        this.sectorDibujo = sectorDibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.agregarBloque(new BloqueMovimiento(direccion));
        stage.setScene(SceneUtil.getScene(stage, sectorAlgoritmo, sectorDibujo));
    }
}