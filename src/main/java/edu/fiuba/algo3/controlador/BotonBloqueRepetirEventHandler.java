package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.ContenedorVentana;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonBloqueRepetirEventHandler implements EventHandler<ActionEvent> {

    private final BloqueAcoplado sectorAlgoritmo;
    private final SectorDibujo sectorDibujo;
    private final BloqueRepetir bloqueRepetir;
    private final Stage stage;

    public BotonBloqueRepetirEventHandler(Stage stage, BloqueAcoplado sectorAlgoritmo, SectorDibujo sectorDibujo, BloqueRepetir bloqueRepetir) {
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
