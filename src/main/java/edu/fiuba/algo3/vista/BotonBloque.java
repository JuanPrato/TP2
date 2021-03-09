package edu.fiuba.algo3.vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class BotonBloque extends BotonZoomeable {

    public BotonBloque(String texto, double anchoDefault, double altoDefault, double anchoZoom, double altoZoom, Paint colorDefault, Paint colorZoom, Image imagen){
        super(texto, anchoDefault, altoDefault, anchoZoom, altoZoom, colorDefault, colorZoom);
        this.setFont(Font.font("Calibri", FontWeight.BOLD,18));
        this.setTextFill(Paint.valueOf("F7F5E6"));
        this.setTextAlignment(TextAlignment.CENTER);
        ImageView imageView = new ImageView(imagen);
        this.setGraphic(imageView);
    }


}
