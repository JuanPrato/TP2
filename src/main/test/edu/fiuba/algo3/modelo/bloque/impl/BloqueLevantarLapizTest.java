package edu.fiuba.algo3.modelo.bloque.impl;

import edu.fiuba.algo3.modelo.lapiz.ILapiz;
import edu.fiuba.algo3.modelo.lapiz.impl.LapizAbajo;
import edu.fiuba.algo3.modelo.lapiz.impl.LapizLevantado;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueLevantarLapizTest {


    private BloqueLevantarLapiz bloqueLevantarLapiz = new BloqueLevantarLapiz();

    @Mock
    private SectorDibujo sectorDibujo = Mockito.mock(SectorDibujo.class);


    @Test
    void alRealizarLaAccionIntentaCambiarElLapizPorUnoAbajo() {

        ArgumentCaptor<ILapiz> lapizCaptor = ArgumentCaptor.forClass(LapizLevantado.class);

        Mockito.doNothing().when(sectorDibujo).actualizarLapizPersonaje(lapizCaptor.capture());

        bloqueLevantarLapiz.accion(sectorDibujo);

        ILapiz lapiz = lapizCaptor.getValue();

        Assertions.assertEquals(LapizLevantado.class,lapiz.getClass());

    }

}
