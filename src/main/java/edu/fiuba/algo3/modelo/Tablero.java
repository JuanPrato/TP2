package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.linea.Linea;
import javafx.scene.shape.Line;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private final List<Linea> recorrido = new ArrayList<Linea>();

    public Tablero(){
    }

    public void actualizar(Linea linea){
        recorrido.add(linea);
    }

    public List<Linea> getRecorrido(){
        return recorrido;
    }

    public List<Line> visualizar(){
        List<Line> lineas = new ArrayList<>();
        for (Linea linea : recorrido) {
            lineas.add(linea.vista());
        }
        return lineas;
    }
}
