package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.linea.Linea;
import javafx.scene.shape.Line;

import java.util.List;

public class SectorDibujo {

    static private final SectorDibujo sectorDibujoIns = new SectorDibujo();
    private Tablero tablero = new Tablero();
    private Personaje personaje = new Personaje();

    public SectorDibujo() {
    }

    public SectorDibujo(Personaje personaje){
        this.personaje = personaje;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Tablero getTablero(){return tablero;}

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void bajarLapizDelPersonaje(){
        personaje.bajarLapiz();
    }

    public void subirLapizDelPersonaje() {personaje.subirLapiz();}

    public void actualizarPosicionPersonaje(Direccion direccion) {
        Linea linea = personaje.moverYDibujar(direccion);
        tablero.actualizar(linea);
    }

    public void reiniciarTablero(){
        tablero = new Tablero();
        personaje = new Personaje();
    }

    static public SectorDibujo getInstance(){
        return sectorDibujoIns;
    }

}
