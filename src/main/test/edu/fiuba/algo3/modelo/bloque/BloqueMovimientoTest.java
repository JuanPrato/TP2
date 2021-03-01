package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.lang.reflect.Array;
import java.util.List;


public class BloqueMovimientoTest {

    private BloqueMovimiento bloqueMovimiento;

    @BeforeEach
    void setUp() {
        bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());
    }

    @Test
    void testElBloqueMovimientoDeberiaDesplazarAlPersonaje(){
        SectorDibujo sectorDibujo = new SectorDibujo();

        bloqueMovimiento.accion(sectorDibujo);

        Posicion posicionPersonaje = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertNotEquals(new Posicion(0, 0), posicionPersonaje);
    }

    @Test
    void testElBloqueMovientoDeberiaDeplazarEnLaDireccionCorrecta() {

        SectorDibujo sectorDibujo = new SectorDibujo();

        bloqueMovimiento.accion(sectorDibujo);

        Posicion posicionPersonaje = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0, -10), posicionPersonaje);

    }

}
