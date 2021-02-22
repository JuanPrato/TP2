package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;

import java.util.ArrayList;
import java.util.List;

public class Lapiz implements ILapiz{

    private IEstadoLapiz estado;
    private final List<Linea> lineas;


    public Lapiz(){
        estado = new Levantado();
        lineas = new ArrayList<>();
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    @Override
    public void bajarLapiz() {
        this.estado = new Abajo();
    }

    @Override
    public void levantarLapiz() {
        this.estado = new Levantado();
    }

    @Override
    public void dibujar(Posicion posicionInicial, Posicion posicionFinal) {
        lineas.add(estado.realizarLinea(posicionInicial, posicionFinal));
    }
}
