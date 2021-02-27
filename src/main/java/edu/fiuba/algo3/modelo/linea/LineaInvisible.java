package edu.fiuba.algo3.modelo.linea;

import edu.fiuba.algo3.modelo.Posicion;

public class LineaInvisible extends Linea{

    public LineaInvisible(Posicion posicionInicial, Posicion posicionFinal){
        super(posicionInicial, posicionFinal);
    }

    @Override
    public boolean colocar(){
        return false;
    }
}
