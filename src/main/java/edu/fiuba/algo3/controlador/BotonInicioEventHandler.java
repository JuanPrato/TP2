package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.vista.ContenedorTablero;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonInicioEventHandler implements EventHandler {
    Stage stage;

    public BotonInicioEventHandler(Stage stage) {
        super();
        this.stage = stage;

    }

    @Override
    public void handle(Event event) {
        stage.setScene( new Scene(new ContenedorTablero(stage, new Tablero()), 1750,1750));
    }
}