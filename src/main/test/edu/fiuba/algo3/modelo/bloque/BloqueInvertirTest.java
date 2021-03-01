package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.linea.Linea;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BloqueInvertirTest {

    private BloqueInvertir bloqueInvertir;
    private SectorDibujo sectorDibujo;
    @BeforeEach
    void setUp() {
        bloqueInvertir = new BloqueInvertir();
        sectorDibujo = new SectorDibujo();
    }

    @Test
    void testBloqueInvertirDeberiaInvertirAlBloqueMovimiento(){

        BloqueMovimiento bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());

        bloqueInvertir.agregarBloque(bloqueMovimiento);

        bloqueInvertir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0,-10), posicion);

    }

    @Test
    void testBloqueInvertirDeberiaInvertirAlBloqueBajarLapizLevantandoElLapiz(){

        IBloque bloqueBajarLapiz = new BloqueBajarLapiz();

        bloqueInvertir.agregarBloque(bloqueBajarLapiz);

        bloqueInvertir.accion(sectorDibujo);

        Linea linea = sectorDibujo.getPersonaje().moverYDibujar(Direccion.abajo());

        Assertions.assertFalse(linea.colocar());
    }

    @Test
    void testBloqueInvertirDeberiaInvertirAlBloqueBajarLapizBajandoElLapiz(){

        sectorDibujo.subirLapizDelPersonaje();

        IBloque bloqueLevantarLapiz = new BloqueLevantarLapiz();

        bloqueInvertir.agregarBloque(bloqueLevantarLapiz);

        bloqueInvertir.accion(sectorDibujo);

        Linea linea = sectorDibujo.getPersonaje().moverYDibujar(Direccion.abajo());

        Assertions.assertTrue(linea.colocar());
    }

    @Test
    void testBloqueInvertirDeberiaInvertirRepetirInvitiendoAQuienContiene(){


        BloqueRepetir bloqueRepetir = new BloqueRepetir(2);

        bloqueRepetir.agregarBloque(new BloqueMovimiento(Direccion.abajo()));

        bloqueInvertir.agregarBloque(bloqueRepetir);

        bloqueInvertir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0, -20), posicion);
    }

    @Test
    void testBloqueInvertirDeberiaInvertirPersonalizadoInvitiendoAQuienContiene(){

        BloquePersonalizado bloquePersonalizado = new BloquePersonalizado();

        bloquePersonalizado.agregarBloque(new BloqueMovimiento(Direccion.abajo()));

        bloqueInvertir.agregarBloque(bloquePersonalizado);

        bloqueInvertir.accion(sectorDibujo);

        Posicion posicion = sectorDibujo.getPersonaje().getPosicion();

        Assertions.assertEquals(new Posicion(0, -10), posicion);
    }

}
