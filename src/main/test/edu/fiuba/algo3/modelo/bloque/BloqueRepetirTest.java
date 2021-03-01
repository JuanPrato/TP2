package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BloqueRepetirTest {

    private BloqueRepetir bloqueRepetir;

    @BeforeEach
    public void setUp(){
        bloqueRepetir = new BloqueRepetir(2);
    }

    @Test
    public void testElBloqueDeberiaRepetirElBloqueMovimiento(){

        BloqueMovimiento bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());
        SectorDibujo sectorDibujo = new SectorDibujo();

        bloqueRepetir.agregarBloque(bloqueMovimiento);

        bloqueRepetir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0,-20), posicion);
    }

    @Test
    public void testElBloqueDeberiaRepetirElBloque(){

        BloqueMovimiento bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());
        SectorDibujo sectorDibujo = new SectorDibujo();

        bloqueRepetir.agregarBloque(bloqueMovimiento);

        bloqueRepetir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0,-20), posicion);
    }

    @Test
    public void testElBloqueRepetirDeberiaPoderInvertirse(){
        BloqueMovimiento bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());
        SectorDibujo sectorDibujo = new SectorDibujo();

        bloqueRepetir.agregarBloque(bloqueMovimiento);
        bloqueRepetir.invertir();
        bloqueRepetir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0,20), posicion);
    }
}
