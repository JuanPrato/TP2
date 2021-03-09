package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.*;
import edu.fiuba.algo3.modelo.bloque.*;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

    public ContenedorBloques(Stage stage, SectorDibujo sectorDibujo, ContenedorDeBloques contenedorActual) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50,50,50,50));
        this.setBackground(new Background(new BackgroundFill(Color.web("ffffff"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(14);

        List<Button> botones = new ArrayList<>();

        Text titulo = new Text("Bloques");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,30));
        titulo.setFill(Color.web("7665a0"));

        VBox botonesPersonalizado = new VBox();
        botonesPersonalizado.setAlignment(Pos.CENTER);
        botonesPersonalizado.setSpacing(5);
        HBox botoneraTop = new HBox();
        botoneraTop.setSpacing(5);
        Button botonPersonalizado = new BotonBloque("Personalizado", 185, 70, 185, 70, Color.web("FFD248"),
                Color.web("AD8B2A"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/personalizar.png"));
        botonPersonalizado.setOnAction(new BotonBloqueContenedorEventHandler(stage, contenedorActual, sectorDibujo, BloquePersonalizado.getInstance()));

        Button remove = new BotonBloque("Limpiar", 185, 70, 185, 70, Color.web("FFD248"),
                Color.web("AD8B2A"), (new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Remover.png")));
        remove.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                BloquePersonalizado.getInstance().limpiarAlgoritmo();
            }
        });

        Button botonSave = new BotonBloque("Guardar", 185, 70, 185, 70, Color.web("FFD248"),
                Color.web("AD8B2A"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/diskette.png"));
        botonSave.setOnAction(new BotonSaveEventHandler());

        botoneraTop.getChildren().addAll(botonSave, remove);
        botonesPersonalizado.getChildren().addAll(botoneraTop, botonPersonalizado);

        this.getChildren().addAll(titulo, botonesPersonalizado);

        //---------------------

        HBox botoneraDireccionUno = new HBox();
        botoneraDireccionUno.setSpacing(5);
        botoneraDireccionUno.setAlignment(Pos.CENTER);

        Button botonBloqueArriba = new BotonBloque("Arriba", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/BloqueArriba.png"));
        botonBloqueArriba.setOnAction(new BotonBloqueDireccionEventHandler(stage, contenedorActual, sectorDibujo, Direccion.arriba()));
        botonBloqueArriba.setDefaultButton(true);

        Button botonBloqueAbajo = new BotonBloque("Abajo", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/BloqueAbajo.png"));
        botonBloqueAbajo.setOnAction(new BotonBloqueDireccionEventHandler(stage, contenedorActual, sectorDibujo, Direccion.abajo()));
        botonBloqueAbajo.setDefaultButton(true);

        botoneraDireccionUno.getChildren().addAll(botonBloqueArriba, botonBloqueAbajo);

        HBox botoneraDireccionDos = new HBox();
        botoneraDireccionDos.setAlignment(Pos.CENTER);
        botoneraDireccionDos.setSpacing(5);

        Button botonBloqueIzquierda = new BotonBloque("Izquierda", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/BloqueIzquierda.png"));
        botonBloqueIzquierda.setOnAction(new BotonBloqueDireccionEventHandler(stage, contenedorActual, sectorDibujo, Direccion.izquierda()));
        botonBloqueIzquierda.setFont(Font.font("Calibri", FontWeight.BOLD,15));
        botonBloqueIzquierda.setDefaultButton(true);

        Button botonBloqueDerecha = new BotonBloque("Derecha", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/BloqueDerecha.png"));
        botonBloqueDerecha.setOnAction(new BotonBloqueDireccionEventHandler(stage, contenedorActual, sectorDibujo, Direccion.derecha()));
        botonBloqueDerecha.setDefaultButton(true);

        botoneraDireccionDos.getChildren().addAll(botonBloqueIzquierda, botonBloqueDerecha);

        this.getChildren().addAll(botoneraDireccionUno, botoneraDireccionDos);

        //------------------------

        Button botonBloqueBajarLapiz = new BotonBloque("Bajar Lapiz", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/LapizAbajo.png"));
        botonBloqueBajarLapiz.setOnAction(new BotonModificarLapizEventHandle(stage, contenedorActual, sectorDibujo, new BloqueBajarLapiz()));
        botonBloqueBajarLapiz.setDefaultButton(true);
        botones.add(botonBloqueBajarLapiz);

        Button botonBloqueSubirLapiz = new BotonBloque("Subir Lapiz", 185, 70, 185, 70,
                Color.web("00adbc"), Color.web("036a73"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/LapizLevantado.png"));
        botonBloqueSubirLapiz.setOnAction(new BotonModificarLapizEventHandle(stage, contenedorActual    , sectorDibujo, new BloqueLevantarLapiz()));
        botonBloqueSubirLapiz.setDefaultButton(true);
        botones.add(botonBloqueSubirLapiz);


        Button botonBloqueRepetir = new BotonBloque("X2", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Repetir.png"));
        botonBloqueRepetir.setOnAction(new BotonBloqueContenedorEventHandler(stage, contenedorActual, sectorDibujo, new BloqueRepetir(2)));
        botonBloqueRepetir.setDefaultButton(true);
        botones.add(botonBloqueRepetir);

        Button botonBloqueRepetir3 = new BotonBloque("X3", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Repetir.png"));
        botonBloqueRepetir3.setOnAction(new BotonBloqueContenedorEventHandler(stage, contenedorActual, sectorDibujo, new BloqueRepetir(3)));
        botonBloqueRepetir3.setDefaultButton(true);
        botones.add(botonBloqueRepetir3);

        Button botonInvertir = new BotonBloque("Invertir", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Invertir.png"));
        botonInvertir.setOnAction(new BotonBloqueContenedorEventHandler(stage, contenedorActual, sectorDibujo, new BloqueInvertir()));
        botonInvertir.setDefaultButton(true);
        botones.add(botonInvertir);

        Button botonFree = new BotonBloque("Salir del\ncontenedor", 185, 70, 185, 70, Color.web("ef5ca3"),
                Color.web("ae3e74"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/ambasTachadas.png"));
        botonFree.setFont(Font.font("Calibri", FontWeight.BOLD,15));
        botonFree.setOnAction(new BotonFreeEventHandler(stage));
        botonFree.setDefaultButton(true);
        botones.add(botonFree);

        Button botonLimpiar = new BotonBloque("Reiniciar", 185, 70, 185, 70, Color.web("7665a0"),
                Color.web("645880"), new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Limpiar.png"));
        botonLimpiar.setOnAction(new BotonReiniciarEventHandler(stage));
        botonLimpiar.setDefaultButton(true);
        botones.add(botonLimpiar);

        this.getChildren().addAll(botones);

    }

}
