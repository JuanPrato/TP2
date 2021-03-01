package edu.fiuba.algo3.vista;

import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BotonBloqueArriba extends BotonZoomeable {

    public BotonBloqueArriba(String texto, double anchoDefault, double altoDefault, double anchoZoom, double altoZoom, Paint colorDefault, Paint colorZoom){
        super(texto, anchoDefault, altoDefault, anchoZoom, altoZoom, colorDefault, colorZoom);
        this.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        this.setTextFill(Paint.valueOf("F7F5E6"));
    }


}
