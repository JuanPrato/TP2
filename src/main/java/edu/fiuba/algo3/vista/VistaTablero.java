package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

import java.util.List;

public class VistaTablero extends StackPane {
    static private VistaTablero instance = new VistaTablero(SectorDibujo.getInstance());

    private SectorDibujo sectorDibujo;
    private Label personaje;
    private int posCentroX = 250;
    private int posCentroY = 250;

    static VistaTablero getInstance(){
        return instance;
    }

    public static void reiniciarTablero(){
        instance = new VistaTablero(SectorDibujo.getInstance());
    }


    public VistaTablero(SectorDibujo sectorDibujo){
        this.sectorDibujo = sectorDibujo;
        Label fondoTablero = new Label();
        fondoTablero.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/fondoParaDibujar.png")));
        this.personaje =  new Label();
        this.personaje.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/SinMover.png")));
        this.getChildren().addAll(fondoTablero, personaje);
    }

    public void dibujarTablero(){
        this.getChildren().remove(personaje);
        List<Linea> recorrido = this.sectorDibujo.getTablero().getRecorrido();
        recorrido.forEach(linea->{
            if(linea.colocar()){
                this.dibujarLinea(linea.getPosicionInicial(), linea.getPosicionFinal(), linea.posicionamiento(), linea.direccion());
            }
        });
        personaje = sectorDibujo.getPersonaje().vista();
        this.getChildren().add(personaje);
    }

    private void dibujarLinea(Posicion posInicial, Posicion posFinal, String posicionamiento, String direccion){
        Label linea = new Label();
        linea.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Linea"+posicionamiento+".png")));
        // x = 0, y = 10 representa la posicion del personaje respecto a la linea
        //linea.getTransforms().add(new Translate(posInicial.getPosicionX() + 0, posInicial.getPosicionY() + 10));
        System.out.println("posIniX "+posInicial.getPosicionX());
        System.out.println("posFiniX "+posFinal.getPosicionX());
        System.out.println("posIniY "+posInicial.getPosicionY());
        System.out.println("posFinY "+posFinal.getPosicionY());
        if(direccion == "ABAJO"){
            linea.getTransforms().add(new Translate(posInicial.getPosicionX() , posFinal.getPosicionY() - 5));
        }
        if(direccion == "DERECHA"){
            linea.getTransforms().add(new Translate(posInicial.getPosicionX()+22, posInicial.getPosicionY() + 15));
        }
        if(direccion == "ARRIBA"){
            linea.getTransforms().add(new Translate(posInicial.getPosicionX() , posInicial.getPosicionY() -5));
        }
        if(direccion == "IZQUIERDA"){
            linea.getTransforms().add(new Translate(posInicial.getPosicionX()-20, posInicial.getPosicionY() + 15));
        }
        this.getChildren().add(linea);
    }
}
