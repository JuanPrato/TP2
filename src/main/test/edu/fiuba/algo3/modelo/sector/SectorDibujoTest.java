package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

public class SectorDibujoTest {

    @Mock
    private Personaje personaje = Mockito.mock(Personaje.class);

    private SectorDibujo sector;

    @BeforeEach
    private void setUp(){
        sector = new SectorDibujo(personaje);
    }

    @Test
    void puedoActualizarLaPosicionDelPersonajeCorrectamenteX(){

        ArgumentCaptor<Integer> posicionCaptor = ArgumentCaptor.forClass(Integer.class);

        Mockito.doNothing().when(personaje).mover(posicionCaptor.capture(), posicionCaptor.capture());

        sector.actualizarPosicionPersonaje(1,0);

        int posicionDesplazadaEnX = posicionCaptor.getAllValues().get(0);

        Assertions.assertEquals(1, posicionDesplazadaEnX);
    }

    @Test
    void puedoActualizarLaPosicionDelPersonajeCorrectamenteY(){

        ArgumentCaptor<Integer> posicionCaptor = ArgumentCaptor.forClass(Integer.class);

        Mockito.doNothing().when(personaje).mover(posicionCaptor.capture(), posicionCaptor.capture());

        sector.actualizarPosicionPersonaje(0,1);

        int posicionDesplazadaEnY = posicionCaptor.getAllValues().get(1);

        Assertions.assertEquals(1, posicionDesplazadaEnY);
    }

}
