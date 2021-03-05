package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class ContenedorDibujo extends VBox {
    private Stage stage;

    public ContenedorDibujo(Stage stage, SectorDibujo sectorDibujo, BloqueAcoplado sectorAlgoritmo) {
        super();
        this.stage = stage;
        //stage.setMaximized(true);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("f0f8fb"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(5);

        StackPane tablero = new StackPane();
        ContenedorTablero contenedorPersonaje = new ContenedorTablero(sectorDibujo);

        //ContenedorTablero.dibujarLinea(new Posicion(25,25),new Posicion(35,26));
        Label fondoTablero = new Label();
        fondoTablero.setGraphic(new ImageView(new Image ("vista/imagenes/fondoParaDibujar.png")));

        Label personaje = new Label();
        personaje.setGraphic(new ImageView(new Image("vista/imagenes/PersonajePrin.png")));
        personaje.getTransforms().add(new Translate(5,5));

        tablero.getChildren().addAll(fondoTablero, contenedorPersonaje, personaje);

        Button botonEjecutar = new BotonEjecutar("Ejecutar",140,70,160,70,Color.web("ffa400"), Color.web("c37e01"));
        botonEjecutar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SectorAlgoritmo.getInstance().ejecutarAlgoritmo(sectorDibujo);
                //Linea lineas = sectorDibujo.getTablero().getRecorrido();
                //contenedorPersonaje(lineas);
                stage.setScene(SceneUtil.getScene(stage, sectorAlgoritmo, sectorDibujo));
            }
        });
        botonEjecutar.setDefaultButton(true);

        // Este es un separador
        Region region = new Region();
        region.setPrefHeight(70);

        // Otro separador
        Region region2 = new Region();
        region.setPrefHeight(50);

        Button botonSalir = new BotonFinal("Salir", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonSalir.setOnAction(new BotonSalirEventHandler());
        botonSalir.setDefaultButton(true);

        this.getChildren().addAll(tablero, region, botonEjecutar, region2, botonSalir);

    }

}
