package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.util.List;

public class TableroVista extends StackPane {
    static private TableroVista instance = new TableroVista(SectorDibujo.getInstance());

    private SectorDibujo sectorDibujo;
    private Label personaje;

    static TableroVista getInstance(){
        return instance;
    }

    public static void reiniciarTablero(){
        instance = new TableroVista(SectorDibujo.getInstance());
    }

    public TableroVista(SectorDibujo sectorDibujo){
        this.sectorDibujo = sectorDibujo;
        Label fondoTablero = new Label();
        fondoTablero.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/fondoDibujo.png")));
        this.personaje =  new Label();
        this.personaje.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/SinMover.png")));
        this.getChildren().addAll(fondoTablero, personaje);
    }

    public void dibujarTablero(){
        Timeline lineaDibujadaTime = new Timeline();
        this.getChildren().remove(personaje);
        List<Linea> recorrido = this.sectorDibujo.getTablero().getRecorrido();
        recorrido.forEach(linea->{
            if(linea.colocar()){
                KeyFrame dibujarLinea = new KeyFrame(Duration.seconds(0.5), event->{
                    this.dibujarLinea(linea.getPosicionInicial(), linea.getPosicionFinal(), linea.posicionamiento());
                } );
                lineaDibujadaTime.getKeyFrames().add(dibujarLinea);
            }
        });
        lineaDibujadaTime.play();
        personaje = sectorDibujo.getPersonaje().vista();
        this.getChildren().add(personaje);


    }

    private void dibujarLinea(Posicion posInicial, Posicion posFinal, String posicionamiento){
        Label linea = new Label();
        linea.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Linea"+posicionamiento+".png")));
        if( (posFinal.getPosicionX() - posInicial.getPosicionX()) > 0){
            //DERECHA
            linea.getTransforms().add(new Translate(posInicial.getPosicionX()+22, posInicial.getPosicionY() + 15));
        }
        if( (posFinal.getPosicionX() - posInicial.getPosicionX()) < 0){
            //IZQUIERDA
            linea.getTransforms().add(new Translate(posFinal.getPosicionX()+22, posInicial.getPosicionY() + 15));
        }
        if ( (posFinal.getPosicionY() - posInicial.getPosicionY()) < 0){
            //ARRIBA
            linea.getTransforms().add(new Translate(posInicial.getPosicionX() , posInicial.getPosicionY() -5));
        }
        if ( (posFinal.getPosicionY() - posInicial.getPosicionY()) > 0) {
            //ABAJO
            linea.getTransforms().add(new Translate(posInicial.getPosicionX(), posFinal.getPosicionY() - 5));
        }
        this.getChildren().add(linea);
    }

}
