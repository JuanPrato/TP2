package edu.fiuba.algo3.modelo.linea;

import edu.fiuba.algo3.modelo.Posicion;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public abstract class Linea {
    protected Posicion posicionInicial;
    protected Posicion posicionFinal;

    public Linea(Posicion posicionInicial, Posicion posicionFinal){
        this.posicionInicial = posicionInicial;
        this.posicionFinal = posicionFinal;
    }

    public Posicion getPosicionInicial() {
        return posicionInicial;
    }

    public Posicion getPosicionFinal() {
        return posicionFinal;
    }

    public void alargar(int valor){
        posicionFinal = new Posicion(posicionFinal.getPosicionX()*valor, posicionFinal.getPosicionY()*valor );
    }

    public void achicar(int valor){
        posicionFinal = new Posicion(posicionFinal.getPosicionX()/valor, posicionFinal.getPosicionY()/valor );
    }

    public abstract boolean colocar();

    public String posicionamiento(){
        if(posicionInicial.getPosicionX() == posicionFinal.getPosicionX()){
            return "VERTICAL";
        }
        if(posicionInicial.getPosicionY() == posicionFinal.getPosicionY()){
            return "HORIZONTAL";
        }else{
            return "OTRO";
        }
    }
}
