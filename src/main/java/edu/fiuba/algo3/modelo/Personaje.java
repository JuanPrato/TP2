package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.lapiz.Lapiz;
import edu.fiuba.algo3.modelo.linea.Linea;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;

public class Personaje {
    private String ultimaDireccion = "ABAJO";

    private Posicion posicion = new Posicion();

    private final Lapiz lapiz = new Lapiz();

    public Personaje() {}

    public Lapiz getLapiz() {
        return lapiz;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Linea moverYDibujar(Direccion direccion){
        Posicion posicionAnterior = this.posicion;
        this.posicion = direccion.proximaPosicion(this.posicion);
        ultimaDireccion = direccion.direccionToString();

        return lapiz.dibujar(posicionAnterior, this.posicion);
    }

    public void subirLapiz(){
        lapiz.levantarLapiz();
    }

    public void bajarLapiz(){
        lapiz.bajarLapiz();
    }

    public Label vista() {
        Label personaje = new Label();
        personaje.setGraphic(new ImageView(new Image("file:src/main/java/edu/fiuba/algo3/vista/imagenes/Dibujar"+ultimaDireccion+".png")));
        personaje.getTransforms().add(new Translate(posicion.getPosicionX(),posicion.getPosicionY()));
        return personaje;
    }
}
