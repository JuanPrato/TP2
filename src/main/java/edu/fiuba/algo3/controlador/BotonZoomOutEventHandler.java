package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.vista.BotonZoomeable;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class BotonZoomOutEventHandler implements EventHandler<MouseEvent> {
    private BotonZoomeable boton;

    public BotonZoomOutEventHandler(BotonZoomeable boton){
        this.boton = boton;
    }
    
    @Override
    public void handle(MouseEvent t) {
        boton.zoomOut();
    }
}




