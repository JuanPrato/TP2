package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.lapiz.IEstadoLapiz;
import edu.fiuba.algo3.modelo.lapiz.EstadoLapizLevantado;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BloqueLevantarLapizTest {

    private BloqueLevantarLapiz bloqueLevantarLapiz = new BloqueLevantarLapiz();

    @Mock
    private Personaje personaje = Mockito.mock(Personaje.class);


    @Test
    void alRealizarLaAccionIntentaCambiarElLapizPorUnoAbajo() {

        ArgumentCaptor<IEstadoLapiz> lapizCaptor = ArgumentCaptor.forClass(EstadoLapizLevantado.class);

        Mockito.doNothing().when(personaje).levantarLapiz();

        bloqueLevantarLapiz.accion(personaje);

        IEstadoLapiz lapiz = lapizCaptor.getValue();

        Assertions.assertEquals(EstadoLapizLevantado.class,lapiz.getClass());

    }

}
