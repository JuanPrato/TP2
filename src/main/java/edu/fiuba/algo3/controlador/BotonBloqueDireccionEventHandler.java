package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonBloqueDireccionEventHandler implements EventHandler<ActionEvent> {

    private final ContenedorDeBloques contenedorActual;
    private final SectorDibujo sectorDibujo;
    private final Direccion direccion;
    private final Stage stage;

    public BotonBloqueDireccionEventHandler(Stage stage, ContenedorDeBloques contenedorActual, SectorDibujo sectorDibujo, Direccion bloque){
        this.contenedorActual = contenedorActual;
        this.direccion = bloque;
        this.stage = stage;
        this.sectorDibujo = sectorDibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        contenedorActual.agregarBloque(new BloqueMovimiento(direccion));
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), sectorDibujo, contenedorActual));
    }
}