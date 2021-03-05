package edu.fiuba.algo3;

import javafx.application.Application;
import edu.fiuba.algo3.vista.ContenedorInicio;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.util.Stack;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Scene escenaInicio = new Scene(new ContenedorInicio(stage), 500,700);

        //personaje.setTranslateX(posicion.getPosicionX());
        //personaje.setTranslateY(posicion.getPosicionY());

        stage.setTitle("AlgoBlocks");
        stage.setScene(escenaInicio);
        //stage.getIcons().add(new Image("vista/imagenes/LapizLevantado.png"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}