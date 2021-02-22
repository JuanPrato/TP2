package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.lapiz.IEstadoLapiz;

public class SectorDibujo {

    private Personaje personaje;

    public SectorDibujo() {
    }

    public SectorDibujo(Personaje personaje){
        this.personaje = personaje;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

}
