package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.linea.LineaVisible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Line;
import java.util.List;

public class TableroTest {

    private Tablero tablero;

    @BeforeEach
    public void setUp(){
        tablero = new Tablero();
    }

    @Test
    public void testActualizarElRecorridoDeberiaAgregarUnaLinea(){

        Linea linea = new LineaVisible(new Posicion(0,0), new Posicion(10,0));

        tablero.actualizar(linea);

        List<Linea> lineas = tablero.getRecorrido();

        Assertions.assertEquals(1, lineas.size());

    }


    @Test
    public void testVisualizarDeberiaDevolverUnaUnaListaDeLasLineasADibujar(){

        Linea linea = new LineaVisible(new Posicion(0,0), new Posicion(10,0));

        tablero.actualizar(linea);

        //List<Line> lineas = tablero.visualizar();

        //Assertions.assertTrue((Boolean)lineas.get(0));

    }

}
