package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.*;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonModificarLapizEventHandle implements EventHandler<ActionEvent> {

    private Stage stage;
    private ContenedorDeBloques sectorAlgoritmo;
    private SectorDibujo sectorDibujo;
    private IBloque bloqueEstrategiaLapiz;

    public BotonModificarLapizEventHandle(Stage stage, ContenedorDeBloques sectorAlgoritmo, SectorDibujo sectorDibujo, IBloque bloqueEstrategiaLapiz) {
        this.stage=stage;
        this.sectorAlgoritmo=sectorAlgoritmo;
        this.sectorDibujo = sectorDibujo;
        this.bloqueEstrategiaLapiz = bloqueEstrategiaLapiz;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.agregarBloque(bloqueEstrategiaLapiz);
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), sectorDibujo, sectorAlgoritmo));
    }
}
