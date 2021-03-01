package edu.fiuba.algo3.modelo.direccion;

import edu.fiuba.algo3.modelo.Posicion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DireccionTest {

    @Test
    public void testProximaPosicionDeberiaDarLaProximaPosicionEnLaDireccionCorrecta(){

        Posicion posicion = new Posicion(10,0);

        Direccion direccion = Direccion.derecha();

        posicion = direccion.proximaPosicion(posicion);

        Assertions.assertEquals(new Posicion(20, 0), posicion);

    }

    @Test
    public void testInvertirDireccionDeberiaDarmeLaDireccionInversa(){

        Direccion direccion = Direccion.arriba();
        Posicion posicion = new Posicion(0,0);

        direccion = direccion.inversa();

        posicion = direccion.proximaPosicion(posicion);

        Assertions.assertEquals(new Posicion(0,10), posicion);
    }
}
