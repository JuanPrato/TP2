package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;


public class ContenedorTablero extends GridPane {

    static private ContenedorTablero instance = new ContenedorTablero(SectorDibujo.getInstance());

    private SectorDibujo sectorDibujo;
    private Rectangle[][] celda;

    static ContenedorTablero getInstance(){
        return instance;
    }

    public static void reiniciarTablero(){
        instance = new ContenedorTablero(SectorDibujo.getInstance());
    }

    public ContenedorTablero(SectorDibujo sectorDibujo) {
        this.sectorDibujo = sectorDibujo;
        this.celda = new Rectangle[50][50];
        inicializarTableroVista();
        this.setGridLinesVisible(false);
    }

    public void dibujarTodasLineas(){
        List<Linea> recorrido = this.sectorDibujo.getTablero().getRecorrido();
        recorrido.forEach(linea->{
            // TODO: implementar polimorfismo
            if(linea.colocar()){
                dibujarLinea(linea.getPosicionInicial(), linea.getPosicionFinal());
            }
        });
    }


    public void dibujarLinea(Posicion posInicial, Posicion posFinal){
        int posIniX = (Math.abs(posInicial.getPosicionX()/10 + 25));
        int posFinX = (Math.abs(posFinal.getPosicionX()/10 + 25));
        for(int i= Math.abs(posInicial.getPosicionX()/10), h=posIniX; i <= Math.abs(posFinal.getPosicionX()/10); i++, h=posFinX){
            int posIniY = (Math.abs(posInicial.getPosicionY()/10 + 25));
            int posFinY = (Math.abs(posFinal.getPosicionY()/10 + 25));
            for(int j=Math.abs(posInicial.getPosicionY()/10), k=posIniY; j <= Math.abs(posFinal.getPosicionY()/10); j++, k=posFinY){
                this.celda[k][h].setFill(Color.BLACK);
            }
        }
    }

    private void inicializarTableroVista() {
        for (int j = 0; j < 50; j++) {
            for (int i = 0; i < 50; i++) {
                Rectangle relleno = new Rectangle(10, 10, Color.TRANSPARENT);
                /*relleno.setStrokeType(StrokeType.INSIDE);
                if (j == 25 && i == 25)
                    relleno.setStroke(Color.BLACK);*/
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
