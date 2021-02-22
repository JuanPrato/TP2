package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.bloque.IBloque;
import edu.fiuba.algo3.modelo.bloque.BloqueBajarLapiz;
import edu.fiuba.algo3.modelo.bloque.BloqueLevantarLapiz;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.direccion.Direccion;
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
    void puedoBajarElLapizConElBloqueCorrespondiente(){
        IBloque bloqueBajarLapiz = new BloqueBajarLapiz();
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(bloqueBajarLapiz);

        bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });

    }

    @Test
    void puedoLevantarElLapizDespuesDeBajarloUsandoLosBloquesCorrespondientes() {

        IBloque bloqueBajarLapiz = new BloqueBajarLapiz();
        bloqueBajarLapiz.accion(sectorDibujo);

        IBloque bloqueLevantarLapiz = new BloqueLevantarLapiz();
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(bloqueLevantarLapiz);

        bloques.forEach(bloque -> {
           bloque.accion(sectorDibujo);
        });

    }

    @Test
    void puedoMoverAlPersonajeHaciaArribaUsandoLosBloquesCorrespondientes() {

        IBloque nuevoBloque = new BloqueMovimiento(Direccion.arriba());
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(nuevoBloque);

        int posicionInicialEnY = personaje.getPosicion().getPosicionY();

        bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });

        Assertions.assertEquals(posicionInicialEnY + 1, personaje.getPosicion().getPosicionY());
    }

    @Test
    void puedoMoverAlPersonajeHaciaAbajoUsandoLosBloquesCorrespondientes() {

        IBloque nuevoBloque = new BloqueMovimiento(Direccion.abajo());
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(nuevoBloque);

        int posicionInicialEnY = personaje.getPosicion().getPosicionY();

        bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });

        Assertions.assertEquals(posicionInicialEnY - 1, personaje.getPosicion().getPosicionY());
    }

    @Test
    void puedoMoverAlPersonajeHaciaIzquiedaUsandoLosBloquesCorrespondientes() {

        IBloque nuevoBloque = new BloqueMovimiento(Direccion.izquierda());
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(nuevoBloque);

        int posicionInicialEnY = personaje.getPosicion().getPosicionY();

        bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });

        Assertions.assertEquals(posicionInicialEnY - 1, personaje.getPosicion().getPosicionX());
    }

    @Test
    void puedoMoverAlPersonajeHaciaDerechaUsandoLosBloquesCorrespondientes() {

        IBloque nuevoBloque = new BloqueMovimiento(Direccion.derecha());
        List<IBloque> bloques = new ArrayList<IBloque>();
        bloques.add(nuevoBloque);

        int posicionInicialEnY = personaje.getPosicion().getPosicionY();

        bloques.forEach(bloque -> {
            bloque.accion(sectorDibujo);
        });

        Assertions.assertEquals(posicionInicialEnY + 1, personaje.getPosicion().getPosicionX());
    }
}
