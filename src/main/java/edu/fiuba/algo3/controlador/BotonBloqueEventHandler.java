package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonBloqueEventHandler implements EventHandler<ActionEvent> {

    private final ContenedorDeBloques sectorAlgoritmo;
    private final SectorDibujo sectorDibujo;
    private final IBloque bloqueRepetir;
    private final Stage stage;

    public BotonBloqueEventHandler(Stage stage, ContenedorDeBloques sectorAlgoritmo, SectorDibujo sectorDibujo, IBloque bloqueRepetir) {
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.sectorDibujo = sectorDibujo;
        this.bloqueRepetir = bloqueRepetir;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.agregarBloque(this.bloqueRepetir);
        stage.setScene(SceneUtil.getScene(stage, sectorAlgoritmo, sectorDibujo));
    }
}
