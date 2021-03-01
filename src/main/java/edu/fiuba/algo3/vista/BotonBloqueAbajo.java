package edu.fiuba.algo3.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BotonBloqueAbajo extends BotonZoomeable {

    public BotonBloqueAbajo(String texto, double anchoDefault, double altoDefault, double anchoZoom, double altoZoom, Paint colorDefault, Paint colorZoom){
        super(texto, anchoDefault, altoDefault, anchoZoom, altoZoom, colorDefault, colorZoom);
        this.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        this.setTextFill(Paint.valueOf("F7F5E6"));
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                System.out.println("Buenas");

            }
        });
    }


}
