package edu.fiuba.algo3.modelo.lapiz;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.linea.LineaVisible;
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
    public void testAlCrearUnLapizDeberiaTenerLaEstrategiaDeLevantado(){
        Posicion posicionInicial = new Posicion(0,0);
        Posicion posicionFinal = new Posicion(0,1);

        Linea linea = lapiz.dibujar(posicionInicial, posicionFinal);

        Assertions.assertFalse(linea.colocar());

    }

    @Test
    public void testDeberiaPoderCambiarLaEstrategiaDelLapizAAbajo(){
        lapiz.bajarLapiz();

        Posicion posicionInicial = new Posicion(0,0);
        Posicion posicionFinal = new Posicion(0,1);

        Linea linea = lapiz.dibujar(posicionInicial, posicionFinal);

        Assertions.assertTrue(linea.colocar());
    }

    @Test
    public void testDespuesDeBajarElLapizDeberiaPoderVolverASubirlo(){

        lapiz.bajarLapiz();
        lapiz.levantarLapiz();

        Posicion posicionInicial = new Posicion(0,0);
        Posicion posicionFinal = new Posicion(0,1);

        Linea linea = lapiz.dibujar(posicionInicial, posicionFinal);

        Assertions.assertFalse(linea.colocar());
    }
}
