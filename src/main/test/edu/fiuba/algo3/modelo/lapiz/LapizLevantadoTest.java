package edu.fiuba.algo3.modelo.lapiz;

import org.junit.jupiter.api.Test;

public class LapizLevantadoTest {

    @Test
    void lapizLevantadoEntiendeDibujar() {
        EstadoLapizLevantado lapizLevantado = new EstadoLapizLevantado();

        lapizLevantado.dibujar();
    }

}
