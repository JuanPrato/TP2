package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.vista.SceneUtil;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class RemoverBloqueEventHandler implements EventHandler<ActionEvent> {

    private final IBloque bloque;
    private final Stage stage;
    private final ContenedorDeBloques contenedorActual;

    public RemoverBloqueEventHandler(IBloque bloque, Stage stage, ContenedorDeBloques contenedorActual){
        this.bloque=bloque;
        this.stage = stage;
        this.contenedorActual=contenedorActual;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        contenedorActual.removerBloque(bloque);
        stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), SectorDibujo.getInstance(), contenedorActual));
    }
}
