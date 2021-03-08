package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonRemoverEventHandler implements EventHandler<ActionEvent> {

    private ContenedorDeBloques contenedorBloques;

    public BotonRemoverEventHandler(ContenedorDeBloques contenedorDeBloques){
        this.contenedorBloques = contenedorDeBloques;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        contenedorBloques.removerUltimo();
    }
}
