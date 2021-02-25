package edu.fiuba.algo3.controlador;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class BotonSalirEventHandler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.exit(0);
    }
}
