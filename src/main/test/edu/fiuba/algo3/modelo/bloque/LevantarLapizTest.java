package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LevantarLapizTest {

    private LevantarLapiz levantarLapiz = new LevantarLapiz();
    private SectorDibujo sectorDibujo = new SectorDibujo();

    @Test
    void laInversaDeUnLapizLevantadoEsUnLapizAbajo(){
        IUsarLapiz esUnBajarLapiz = levantarLapiz.inversa();
        esUnBajarLapiz.usar(sectorDibujo);
        Personaje personaje = sectorDibujo.getPersonaje();

        Linea linea = personaje.moverYDibujar(Direccion.derecha());

        Assertions.assertTrue(linea.colocar());
    }

}
