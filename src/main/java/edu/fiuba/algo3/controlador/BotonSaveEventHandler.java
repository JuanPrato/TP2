package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.BloquePersonalizado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonSaveEventHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        BloquePersonalizado b = BloquePersonalizado.getInstance();
        b.guardarAlgoritmo();
    }
}
