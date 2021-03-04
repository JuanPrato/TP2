package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonInicioEventHandler;
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
import javafx.scene.layout.VBox;


public class ContenedorInicio extends VBox {
    Stage stage;
    public ContenedorInicio(Stage stage){
        super();
        this.stage = stage;
        stage.setResizable(false);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("fff9f0"), CornerRadii.EMPTY, Insets.EMPTY)));

        Text titulo = new Text("AlgoBlocks");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,40));
        titulo.setFill(Color.web("7665a0"));

        VBox botoneraInicio = new VBox();

        Button botonInicio = new BotonInicio("Inicio", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonInicio.setOnAction(new BotonInicioEventHandler(stage));
        botonInicio.setDefaultButton(true);

        //Separador
        Region region = new Region();
        region.setPrefHeight(100);

        Button botonSalir = new BotonFinal("Salir", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonSalir.setOnAction(new BotonSalirEventHandler());
        botonSalir.setDefaultButton(true);

        botoneraInicio.getChildren().addAll(botonInicio, botonSalir);
        botoneraInicio.setSpacing(10);
        botoneraInicio.setAlignment(Pos.BOTTOM_CENTER);

        this.getChildren().addAll(titulo, region, botoneraInicio);
    }
}

