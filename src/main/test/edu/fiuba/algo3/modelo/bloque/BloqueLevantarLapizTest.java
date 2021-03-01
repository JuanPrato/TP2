package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueLevantarLapizTest {


    private BloqueLevantarLapiz bloqueLevantarLapiz = new BloqueLevantarLapiz();


    @Test
    void alRealizarLaAccionDeberiaLevantarElLapiz() {

        SectorDibujo sectorDibujo = new SectorDibujo();

        Personaje personaje = sectorDibujo.getPersonaje();
        personaje.bajarLapiz();

        IBloque bloque = new BloqueLevantarLapiz();

        bloque.accion(sectorDibujo);

        Linea linea = personaje.moverYDibujar(Direccion.derecha());

        Assertions.assertFalse(linea.colocar());


    }

}
