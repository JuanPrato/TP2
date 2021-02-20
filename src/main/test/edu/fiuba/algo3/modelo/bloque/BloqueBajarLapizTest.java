package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.lapiz.ILapiz;
import edu.fiuba.algo3.modelo.lapiz.LapizAbajo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueBajarLapizTest {

    private BloqueBajarLapiz bloqueBajarLapiz = new BloqueBajarLapiz();

    @Mock
    private SectorDibujo sectorDibujo = Mockito.mock(SectorDibujo.class);


    @Test
    void alRealizarLaAccionIntentaCambiarElLapizPorUnoAbajo() {

        ArgumentCaptor<ILapiz> lapizCaptor = ArgumentCaptor.forClass(LapizAbajo.class);

        Mockito.doNothing().when(sectorDibujo).actualizarLapizPersonaje(lapizCaptor.capture());

        bloqueBajarLapiz.accion(sectorDibujo);

        ILapiz lapiz = lapizCaptor.getValue();

        Assertions.assertEquals(LapizAbajo.class,lapiz.getClass());

    }

}
