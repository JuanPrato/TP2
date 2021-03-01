package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonBloqueRepetirEventHandler implements EventHandler<ActionEvent> {

    private SectorAlgoritmo sectorAlgoritmo;
    private BloqueRepetir bloqueRepetir;

    public BotonBloqueRepetirEventHandler(SectorAlgoritmo sectorAlgoritmo, BloqueRepetir bloqueRepetir) {
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.bloqueRepetir = bloqueRepetir;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.addBloque(this.bloqueRepetir);
    }
}
