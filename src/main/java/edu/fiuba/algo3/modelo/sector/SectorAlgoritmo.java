package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.IBloque;


public class SectorAlgoritmo extends BloqueAcoplado {
    Personaje personaje;

    public SectorAlgoritmo(Personaje unPersonaje) {
        this.personaje = unPersonaje;
    }

    public void ejecutarAlgoritmo( Personaje personaje ) {
        /* Se pasa el personaje a cada bloque */
    }
}