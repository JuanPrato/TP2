package edu.fiuba.algo3;

import javafx.application.Application;
import edu.fiuba.algo3.vista.ContenedorInicio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.util.Stack;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {

        Scene escenaInicio = new Scene(new ContenedorInicio(stage), 500,700);

        stage.setTitle("AlgoBlocks");
        stage.setScene(escenaInicio);
        stage.show();

        //StackPane layout = new StackPane();
        //Scene scene = new Scene(layout, 640, 480);
    }

    public static void main(String[] args) {
        launch();
    }

}