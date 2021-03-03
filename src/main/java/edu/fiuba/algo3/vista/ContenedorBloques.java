package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonBloqueDireccionEventHandler;
import edu.fiuba.algo3.controlador.BotonBloqueRepetirEventHandler;
import edu.fiuba.algo3.controlador.BotonLimpiarEventHandler;
import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
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

    public ContenedorBloques(Stage stage, BloqueAcoplado sectorAlgoritmo, SectorDibujo sectorDibujo) {
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

        Button botonBloqueArriba = new BotonBloque("Arriba", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueArriba.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.arriba()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueArriba);

        Button botonBloqueAbajo = new BotonBloque("Abajo", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueAbajo.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.abajo()));
        botonBloqueAbajo.setDefaultButton(true);
        botones.add(botonBloqueAbajo);


        Button botonBloqueIzquierda = new BotonBloque("Izquierda", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueIzquierda.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.izquierda()));
        botonBloqueIzquierda.setDefaultButton(true);
        botones.add(botonBloqueIzquierda);

        Button botonBloqueDerecha = new BotonBloque("Derecha", 140, 70, 160, 70, Color.web("00adbc"), Color.web("036a73"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.derecha()));
        botonBloqueDerecha.setDefaultButton(true);
        botones.add(botonBloqueDerecha);

        Button botonBloqueRepetir = new BotonBloque("Repetir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonBloqueRepetir.setOnAction(new BotonBloqueRepetirEventHandler(stage, sectorAlgoritmo, sectorDibujo, new BloqueRepetir(2)));
        botonBloqueRepetir.setDefaultButton(true);
        botones.add(botonBloqueRepetir);

        Button botonInvertir = new BotonBloque("Invertir", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        //botonInvertir.setOnAction(new BotonBloqueRepetirEventHandler(stage, sectorAlgoritmo, sectorDibujo, new BloqueRepetir(2)));
        botonInvertir.setDefaultButton(true);
        botones.add(botonInvertir);

        Button botonFree = new BotonBloque("Free", 140, 70, 160, 70, Color.web("ef5ca3"), Color.web("ae3e74"));
        botonFree.setOnAction(new BotonFreeEventHandler(stage));
        botonFree.setDefaultButton(true);
        botones.add(botonFree);

        Button botonLimpiar = new BotonBloque("Reiniciar", 140, 70, 160, 70, Color.web("7665a0"), Color.web("645880"));
        botonLimpiar.setOnAction(new BotonLimpiarEventHandler(stage));
        botonLimpiar.setDefaultButton(true);
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
