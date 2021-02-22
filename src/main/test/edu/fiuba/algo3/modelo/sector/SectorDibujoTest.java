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

    }

    @Test
    void puedoActualizarLaPosicionDelPersonajeCorrectamenteY(){

    }

}
