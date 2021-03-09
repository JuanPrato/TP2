package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorDibujo extends VBox {
    private Stage stage;

    public ContenedorDibujo(Stage stage, SectorDibujo sectorDibujo, SectorAlgoritmo sectorAlgoritmo) {
        super();
        this.stage = stage;
        //stage.setMaximized(true);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("f0f8fb"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(5);

        TableroVista tableroVista = TableroVista.getInstance();
        HBox botonera = new HBox();

        Button botonEjecutar = new BotonEjecutar("Ejecutar",140,70,160,70,Color.web("ffa400"), Color.web("c37e01"));
        botonEjecutar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SectorAlgoritmo.getInstance().ejecutarAlgoritmo(sectorDibujo);
                tableroVista.dibujarTablero();
                stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), sectorDibujo, sectorAlgoritmo));
            }
        });
        botonEjecutar.setDefaultButton(true);

        Button botonLimpiar = new BotonEjecutar("Limpiar", 140, 70, 160, 70, Color.web("ffa400"), Color.web("c37e01"));
        botonLimpiar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tableroVista.reiniciarTablero();
                sectorAlgoritmo.limpiarTablero(sectorDibujo);
                stage.setScene(SceneUtil.getScene(stage, SectorAlgoritmo.getInstance(), sectorDibujo, sectorAlgoritmo));
            }
        });
        botonLimpiar.setDefaultButton(true);

        botonera.setAlignment(Pos.CENTER);
        botonera.setSpacing(10);
        botonera.getChildren().addAll(botonEjecutar, botonLimpiar);

        // Este es un separador
        Region region = new Region();
        region.setPrefHeight(70);

        // Otro separador
        Region region2 = new Region();
        region.setPrefHeight(50);

        Button botonSalir = new BotonFinal("Salir", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonSalir.setOnAction(new BotonSalirEventHandler());
        botonSalir.setDefaultButton(true);

        this.getChildren().addAll(tableroVista, region, botonera, region2, botonSalir);

    }
}
