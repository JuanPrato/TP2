package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ContenedorBloques extends VBox {
    private Stage stage;

    public ContenedorBloques(Stage stage) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(100,100,100,100));
        this.setBackground(new Background(new BackgroundFill(Color.web("ffffff"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        Text titulo = new Text("Bloques");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,30));
        titulo.setFill(Color.web("7665a0"));

        Button botonBloqueArriba = new BotonBloqueArriba("Arriba", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        //botonBloqueArriba.setOnAction(new BotonBloqueArribaEventHandler());
        botonBloqueArriba.setDefaultButton(true);

        Button botonBloqueAbajo = new BotonBloqueAbajo("Abajo", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        //botonBloqueArriba.setOnAction(new BotonBloqueAbajoEventHandler());
        botonBloqueArriba.setDefaultButton(true);

        Button botonBloqueIzquierda = new BotonBloqueIzquierda("Izquierda", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        //botonBloqueIzquierdaArriba.setOnAction(new BotonBloqueIzquierdaEventHandler());
        botonBloqueArriba.setDefaultButton(true);

        Button botonBloqueDerecha = new BotonBloqueDerecha("Derecha", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        //botonBloqueDerecha.setOnAction(new BotonBloqueDerechaEventHandler());
        botonBloqueArriba.setDefaultButton(true);

        Button botonBloqueRepetir = new BotonBloqueRepetir("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        //botonBloqueRepetir.setOnAction(new BotonBloqueRepetirEventHandler());
        botonBloqueArriba.setDefaultButton(true);

        this.getChildren().addAll(titulo, botonBloqueArriba, botonBloqueAbajo, botonBloqueIzquierda, botonBloqueDerecha, botonBloqueRepetir);

    }

}
