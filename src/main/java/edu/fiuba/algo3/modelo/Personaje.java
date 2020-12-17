module
package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.lapiz.Lapiz;
import edu.fiuba.algo3.modelo.lapiz.impl.LapizLevantado;

public class Personaje {

    Lapiz lapiz = new LapizLevantado();

    Personaje() {}

    Personaje(Lapiz lapiz) {
        this.lapiz = lapiz;
    }

    public Lapiz getLapiz() {
        return lapiz;
    }

    public void setLapiz(Lapiz lapiz) {
        this.lapiz = lapiz;
    }
}
