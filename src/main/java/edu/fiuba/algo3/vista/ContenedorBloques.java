package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonBloqueDireccionEventHandler;
import edu.fiuba.algo3.controlador.BotonBloqueEventHandler;
import edu.fiuba.algo3.controlador.BotonLimpiarEventHandler;
import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.bloque.BloqueInvertir;
import edu.fiuba.algo3.modelo.bloque.BloqueRepetir;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
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

    public ContenedorBloques(Stage stage, ContenedorDeBloques sectorAlgoritmo, SectorDibujo sectorDibujo) {
        super();
        this.stage = stage;
        //stage.setMaximized(true);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50,50,50,50));
        this.setBackground(new Background(new BackgroundFill(Color.web("ffffff"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        List<Button> botones = new ArrayList<>();

        Text titulo = new Text("Bloques");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,30));
        titulo.setFill(Color.web("7665a0"));

        Button botonBloqueArriba = new BotonBloque("Arriba", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/BloqueArriba.png"));
        botonBloqueArriba.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.arriba()));
        botonBloqueArriba.setDefaultButton(true);
        botones.add(botonBloqueArriba);

        Button botonBloqueAbajo = new BotonBloque("Abajo", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/BloqueAbajo.png"));
        botonBloqueAbajo.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.abajo()));
        botonBloqueAbajo.setDefaultButton(true);
        botones.add(botonBloqueAbajo);

        Button botonBloqueIzquierda = new BotonBloque("Izquierda", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/BloqueIzquierda.png"));
        botonBloqueIzquierda.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.izquierda()));
        botonBloqueIzquierda.setDefaultButton(true);
        botones.add(botonBloqueIzquierda);

        Button botonBloqueDerecha = new BotonBloque("Derecha", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/BloqueDerecha.png"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.derecha()));
        botonBloqueDerecha.setDefaultButton(true);
        botones.add(botonBloqueDerecha);

        Button botonBloqueBajarLapiz = new BotonBloque("Bajar Lapiz", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/LapizAbajo.png"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.derecha()));
        botonBloqueDerecha.setDefaultButton(true);
        botones.add(botonBloqueBajarLapiz);

        Button botonBloqueSubirLapiz = new BotonBloque("Subir Lapiz", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:vista/imagenes/LapizLevantado.png"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, sectorAlgoritmo, sectorDibujo, Direccion.derecha()));
        botonBloqueDerecha.setDefaultButton(true);
        botones.add(botonBloqueSubirLapiz);


        Button botonBloqueRepetir = new BotonBloque("RepetirX2", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:vista/imagenes/Repetir.png"));
        botonBloqueRepetir.setOnAction(new BotonBloqueEventHandler(stage, sectorAlgoritmo, sectorDibujo, new BloqueRepetir(2)));
        botonBloqueRepetir.setDefaultButton(true);
        botones.add(botonBloqueRepetir);

        Button botonBloqueRepetir3 = new BotonBloque("RepetirX3", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:vista/imagenes/Repetir.png"));
        botonBloqueRepetir3.setOnAction(new BotonBloqueEventHandler(stage, sectorAlgoritmo, sectorDibujo, new BloqueRepetir(3)));
        botonBloqueRepetir3.setDefaultButton(true);
        botones.add(botonBloqueRepetir3);

        Button botonInvertir = new BotonBloque("Invertir", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:vista/imagenes/BloqueArriba.png"));
        botonInvertir.setOnAction(new BotonBloqueEventHandler(stage, sectorAlgoritmo, sectorDibujo, new BloqueInvertir()));
        botonInvertir.setDefaultButton(true);
        botones.add(botonInvertir);

        /*Button botonFree = new BotonBloque("Free", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("vista/imagenes/BloqueArriba.png"));
        botonFree.setOnAction(new BotonFreeEventHandler(stage));
        botonFree.setDefaultButton(true);
        botones.add(botonFree);*/

        Button botonLimpiar = new BotonBloque("Reiniciar", 185, 70, 185, 70, Color.web("7665a0"),
                Color.web("645880"), new Image("file:vista/imagenes/Limpiar.png"));
        botonLimpiar.setOnAction(new BotonLimpiarEventHandler(stage));
        botonLimpiar.setDefaultButton(true);
        botones.add(botonLimpiar);

        this.getChildren().addAll(titulo);
        this.getChildren().addAll(botones);

    }

}
