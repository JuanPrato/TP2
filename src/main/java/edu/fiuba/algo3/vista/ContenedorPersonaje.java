package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorPersonaje extends VBox {
    private Stage stage;

    public ContenedorPersonaje(Stage stage) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.TOP_LEFT);
        this.setPadding(new Insets(100,100,100,100));
        this.setBackground(new Background(new BackgroundFill(Color.web("fdfaf4"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(5);

    }

}
