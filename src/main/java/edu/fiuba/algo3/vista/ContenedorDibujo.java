package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorDibujo extends VBox {
    private Stage stage;

    public ContenedorDibujo(Stage stage) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setPadding(new Insets(100,100,100,100));
        this.setBackground(new Background(new BackgroundFill(Color.web("f0f8fb"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(5);

        VBox contenedorPersonaje = new ContenedorPersonaje(stage);

        Button botonEjecutar = new BotonEjecutar("Ejecutar",140,70,160,70,Color.web("ffa400"), Color.web("c37e01"));
        //botonSalir.setOnAction(new BotonEjecutarEventHandler());
        botonEjecutar.setDefaultButton(true);

        // Este es un separador
        Region region = new Region();
        region.setPrefHeight(70);

        // Este es un separador
        Region region2 = new Region();
        region.setPrefHeight(50);

        Button botonSalir = new BotonFinal("Salir", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonSalir.setOnAction(new BotonSalirEventHandler());
        botonSalir.setDefaultButton(true);

        this.getChildren().addAll(contenedorPersonaje, region, botonEjecutar, region2, botonSalir);

    }

}
