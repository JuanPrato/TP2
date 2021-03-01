package edu.fiuba.algo3.modelo;


import edu.fiuba.algo3.modelo.linea.Linea;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Linea> recorrido = new ArrayList<Linea>();
    private int cantidadDeTramos;

    public Tablero(){
    }

    public void retrocederPersonaje( ){
        recorrido.remove(cantidadDeTramos - 1);
    }

    public void actualizar(Linea linea){
        recorrido.add(linea);
        cantidadDeTramos += 1;
    }

    public List<Linea> getRecorrido(){
        return recorrido;
    }

    public void visualizar(){
        for (Linea linea : recorrido) {
            linea.colocar();
        }
    }
}
