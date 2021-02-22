package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LapizTest {

    private Lapiz lapiz;

    @BeforeEach
    public void setUp(){
        lapiz = new Lapiz();
    }

    @Test
    public void testAlCrearUnLapizDeberiaTenerElEstadoLevantado(){

        lapiz.dibujar(new Posicion(1,1), new Posicion(1,2));

        List<Linea> lineas = lapiz.getLineas();

        Assertions.assertEquals(1, lineas.size());

        Linea linea =  lineas.get(0);

        Assertions.assertEquals(new Posicion(), linea.getPosicionInicial());

        Assertions.assertEquals(new Posicion(), linea.getPosicionFinal());

    }


}
