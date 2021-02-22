package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueLevantarLapizTest {


    private BloqueLevantarLapiz bloqueLevantarLapiz = new BloqueLevantarLapiz();

    @Mock
    private SectorDibujo sectorDibujo = Mockito.mock(SectorDibujo.class);


    @Test
    void alRealizarLaAccionIntentaCambiarElLapizPorUnoAbajoDeberiaCambiarElLapiz() {


    }

}
