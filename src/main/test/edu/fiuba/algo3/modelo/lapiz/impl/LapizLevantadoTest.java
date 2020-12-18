package edu.fiuba.algo3.modelo.lapiz.impl;

import edu.fiuba.algo3.modelo.lapiz.impl.LapizLevantado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LapizLevantadoTest {

    @Test
    void lapizLevantadoEntiendeDibujar() {
        LapizLevantado lapizLevantado = new LapizLevantado();

        lapizLevantado.dibujar();
    }

}
