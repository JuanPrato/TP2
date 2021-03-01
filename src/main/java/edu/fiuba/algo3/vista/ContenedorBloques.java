package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonBloqueDireccionEventHandler;
import edu.fiuba.algo3.controlador.BotonBloqueRepetirEventHandler;
import edu.fiuba.algo3.controlador.BotonLimpiarEventHandler;
import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ContenedorBloques extends VBox {
    private Stage stage;

    public ContenedorBloques(Stage stage, SectorAlgoritmo sectorAlgoritmo) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(100,100,100,100));
        this.setBackground(new Background(new BackgroundFill(Color.web("ffffff"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        List<Button> botones = new ArrayList<>();

        Text titulo = new Text("Bloques");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,30));
        titulo.setFill(Color.web("7665a0"));

        Button botonBloqueArriba = new BotonBloqueArriba("Arriba", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueArriba.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, Direccion.arriba()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueArriba);

        Button botonBloqueAbajo = new BotonBloqueAbajo("Abajo", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueAbajo.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, Direccion.abajo()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueAbajo);


        Button botonBloqueIzquierda = new BotonBloqueIzquierda("Izquierda", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueIzquierda.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, Direccion.izquierda()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueIzquierda);

        Button botonBloqueDerecha = new BotonBloqueDerecha("Derecha", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, Direccion.derecha()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueDerecha);

        Button botonBloqueRepetir = new BotonBloqueRepetir("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonBloqueRepetir.setOnAction(new BotonBloqueRepetirEventHandler(stage, sectorAlgoritmo, new BloqueRepetir(2)));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueRepetir);

        Button botonInvertir = new BotonBloqueRepetir("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonInvertir.setOnAction(new BotonBloqueRepetirEventHandler(stage, sectorAlgoritmo, new BloqueRepetir(2)));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonInvertir);

        Button botonLimpiar = new BotonLimpiar("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonLimpiar.setOnAction(new BotonLimpiarEventHandler(stage, sectorAlgoritmo));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonLimpiar);

        /*
        Button eliminarUltimo = new BotonEliminarUltimo("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonBloqueRepetir.setOnAction(new BotonBloqueRepetirEventHandler(sectorAlgoritmo, new BloqueRepetir(2)));
        botonBloqueArriba.setDefaultButton(true);
        */
        this.getChildren().addAll(titulo);
        this.getChildren().addAll(botones);

    }

}
