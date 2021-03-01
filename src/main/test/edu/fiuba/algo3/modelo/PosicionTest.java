package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosicionTest {

    @Test
    public void testComparadoDosPosicionEnElMismoLugarDeberianDevolverVerdadero(){

        Posicion posicion = new Posicion(0,0);
        Posicion posicion1 = new Posicion(0,0);

    Assertions.assertEquals(posicion, posicion1);

    }

    @Test
    public void testComparadoDosPosicionEnDiferentesLugaresDeberianDevolverFalso(){

        Posicion posicion = new Posicion(0,0);
        Posicion posicion1 = new Posicion(0,10);

        Assertions.assertNotEquals(posicion, posicion1);

    }

}
