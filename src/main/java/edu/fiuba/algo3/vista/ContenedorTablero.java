package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContenedorTablero extends HBox {
    private Stage stage;
    private Tablero tablero;

    public ContenedorTablero(Stage stage, Tablero tablero) {
        super();
        this.stage = stage;
        this.tablero = tablero;
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("F7F5E6"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        VBox contenedorBloques = new ContenedorBloques(stage);

        VBox contenedorDibujo = new ContenedorDibujo(stage);

        VBox contenedorAlgoritmos = new ContenedorAlgoritmos(stage);

        this.getChildren().addAll(contenedorDibujo, contenedorBloques, contenedorAlgoritmos);

    }

}
