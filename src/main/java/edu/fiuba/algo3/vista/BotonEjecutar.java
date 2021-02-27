package edu.fiuba.algo3.vista;

import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BotonEjecutar extends BotonZoomeable {
    public BotonEjecutar(String texto, double anchoDefault, double altoDefault, double anchoZoom, double altoZoom, Paint colorDefault, Paint colorZoom) {
        super(texto,anchoDefault,altoDefault,anchoZoom,altoZoom,colorDefault,colorZoom);
        this.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        this.setTextFill(Paint.valueOf("FFFFFF"));
    }
}
