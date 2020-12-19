package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosicionTest {

    Posicion posicion;

    @BeforeEach
    void setUp(){
        posicion = new Posicion();
    }

    @Test
    void siNoLeMandoUnaUbicacionInicialComienzaEnCeroX() {

        Assertions.assertEquals(0, posicion.getPosicionX());

    }

    @Test
    void siNoLeMandoUnaUbicacionInicialComienzaEnCeroY() {

        Assertions.assertEquals(0, posicion.getPosicionY());

    }

    @Test
    void puedoCrearloConUnaPosicionInicialPersonalizadaX() {

        posicion = new Posicion(1,0);

        Assertions.assertEquals(1, posicion.getPosicionX());

    }

    @Test
    void puedoCrearloConUnaPosicionInicialPersonalizadaY() {

        posicion = new Posicion(1,1);

        Assertions.assertEquals(1, posicion.getPosicionY());

    }

    @Test
    void puedoMoverEnX() {

        posicion.mover(1,1);

        Assertions.assertEquals(1, posicion.getPosicionX());

    }
    @Test
    void puedoMoverEnY() {

        posicion.mover(1,1);

        Assertions.assertEquals(1, posicion.getPosicionY());

    }

}
