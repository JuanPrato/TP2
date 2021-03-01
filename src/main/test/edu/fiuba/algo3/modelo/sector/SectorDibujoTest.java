package edu.fiuba.algo3.modelo.sector;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class SectorDibujoTest {

    private SectorDibujo sector;

    @BeforeEach
    private void setUp(){
        sector = new SectorDibujo();
    }

    @Test
    void puedoActualizarLaPosicionDelPersonajeCorrectamenteX(){
        sector.actualizarPosicionPersonaje(Direccion.derecha());

        Posicion posicion = sector.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(10, 0), posicion);
    }

    @Test
    void puedoActualizarLaPosicionDelPersonajeCorrectamenteY(){

        sector.actualizarPosicionPersonaje(Direccion.arriba());

        Posicion posicion = sector.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0, -10), posicion);

    }

    @Test
    void testIntentarBajarElLapizDeberiaBajarElLapiz(){

        sector.bajarLapizDelPersonaje();

        sector.actualizarPosicionPersonaje(Direccion.izquierda());

        List<Linea> recorrido = sector.getTablero().getRecorrido();

        Assertions.assertEquals(1, recorrido.size());

    }

    @Test
    void testIntentarBajarElLapizDeberiaSubirElLapiz(){

        sector.bajarLapizDelPersonaje();

        sector.actualizarPosicionPersonaje(Direccion.izquierda());

        List<Linea> recorrido = sector.getTablero().getRecorrido();

        Assertions.assertEquals(1, recorrido.size());

    }

    @Test
    void testLimpiarTableraDeberiaReiniciarElTableraYLaPosicionDelPersonaje(){

        sector.bajarLapizDelPersonaje();

        sector.actualizarPosicionPersonaje(Direccion.izquierda());

        List<Linea> recorrido = sector.getTablero().getRecorrido();
        Posicion posicion = sector.getPersonaje().getPosicion();

        Assertions.assertEquals(1, recorrido.size());
        Assertions.assertNotEquals(new Posicion(0,0), posicion);

        sector.limpiarTablero();

        recorrido = sector.getTablero().getRecorrido();
        posicion = sector.getPersonaje().getPosicion();

        Assertions.assertEquals(0, recorrido.size());

        Assertions.assertEquals(new Posicion(0,0), posicion);

    }


}
