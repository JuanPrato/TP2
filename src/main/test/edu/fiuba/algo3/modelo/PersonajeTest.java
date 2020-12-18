package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.lapiz.impl.LapizLevantado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonajeTest {

    @Test
    void creoUnPersonajeYTienePorDefectoElLapizArriba() {

        Personaje personaje = new Personaje();

        Assertions.assertEquals(personaje.getLapiz().getClass() , new LapizLevantado().getClass());

    }

}
