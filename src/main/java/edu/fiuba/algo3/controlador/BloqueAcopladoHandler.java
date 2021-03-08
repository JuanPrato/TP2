package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BloqueAcopladoHandler implements EventHandler<ActionEvent> {

    private final ContenedorDeBloques contenedorDeBloques;
    private final Stage stage;
    public BloqueAcopladoHandler(ContenedorDeBloques bloque, Stage stage){
        this.contenedorDeBloques = bloque;
        this.stage = stage;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), SectorDibujo.getInstance(), contenedorDeBloques));

    }
}
