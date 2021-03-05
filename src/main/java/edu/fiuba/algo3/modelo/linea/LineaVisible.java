package edu.fiuba.algo3.modelo.linea;

import edu.fiuba.algo3.modelo.Posicion;
import javafx.scene.shape.Line;

public class LineaVisible extends Linea{

    public LineaVisible(Posicion posicionInicial, Posicion posicionFinal){
        super(posicionInicial, posicionFinal);
    }

    @Override
    public boolean colocar(){
        return true;
    }

}
