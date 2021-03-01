package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.bloque.BloqueBajarLapiz;
import edu.fiuba.algo3.modelo.bloque.BloqueLevantarLapiz;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonajeTest {

    private SectorDibujo sectorDibujo;

    private Personaje personaje;

    @BeforeEach
    void setUp() {
        personaje = new Personaje();
        sectorDibujo = new SectorDibujo();

        sectorDibujo.setPersonaje(personaje);
    }

    @Test
    void creoUnPersonajeYTienePorDefectoElLapizArriba() {

    }

    @Test
    void testBajarElLapizDeberiaBajarElLapiz(){
        personaje.bajarLapiz();

        Linea linea = personaje.moverYDibujar(Direccion.izquierda());

        Assertions.assertTrue(linea.colocar());

    }

    @Test
    void testLevantarElLapizDeberiaLevantarElLapiz() {

        personaje.bajarLapiz();
        personaje.subirLapiz();

        Linea linea = personaje.moverYDibujar(Direccion.izquierda());

        Assertions.assertFalse(linea.colocar());

    }

    @Test
    void testMoverYDibujarDeberiaMoverAlPersonajeYGenerarUnaLinea() {

        Linea linea = personaje.moverYDibujar(Direccion.derecha());

        Assertions.assertNotNull(linea);
        Assertions.assertEquals(new Posicion(10,0), personaje.getPosicion());
    }

}
