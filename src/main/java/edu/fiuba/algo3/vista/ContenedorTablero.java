package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ContenedorTablero extends GridPane {
    private SectorDibujo sectorDibujo;
    private Rectangle[][] celda;

    public ContenedorTablero(SectorDibujo sectorDibujo) {
        this.sectorDibujo = sectorDibujo;
        this.celda = new Rectangle[50][50];
        inicializarTableroVista();
        dibujarLinea(new Posicion(25,25),new Posicion(35,26));
        this.setGridLinesVisible(false);
    }

    public void dibujarLinea(Posicion posInicial, Posicion posFinal){
        for(int i=posInicial.getPosicionX() ; i < posFinal.getPosicionX(); i++){
            for(int j=posInicial.getPosicionY(); j < posFinal.getPosicionY(); j++){
                this.celda[i][j].setFill(Color.BLACK);
            }
        }
    }

    private void inicializarTableroVista() {
        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 50; i++) {
                Rectangle relleno = new Rectangle(10, 10, Color.TRANSPARENT);
                this.add(relleno, j, i);
                this.celda[i][j] = relleno;
            }
        }
    }

        /*private void dibujarLinea(){
        for(int i=25; i < 35; i++){
            for(int j=25; j < 26; j++){
                this.celda[i][j].setFill(Color.BLACK);
            }
        }
    }*/


    /*private void setPosicionDelPersonaje(Rectangle personaje, Posicion posicion){

        KeyFrame keyFrame = new KeyFrame(Duration.seconds(2), new KeyValue(personaje.translateXProperty(), posicion.getPosicionX() +10) );
        Timeline timeline = new Timeline(keyFrame);

        timeline.play();

        //personaje.setTranslateX(posicion.getPosicionX());
        //personaje.setTranslateY(posicion.getPosicionY());
    }*/


}
