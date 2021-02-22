package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.direccion.Direccion;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;


public class BloqueMovimientoTest {

    private BloqueMovimiento bloqueMovimiento;

    @Mock
    private final SectorDibujo sectorDibujo = Mockito.mock(SectorDibujo.class);

    @BeforeEach
    void setUp() {
        bloqueMovimiento = new BloqueMovimiento(Direccion.abajo());
    }

    @Test
    void testElBloqueMovientoDeberiaDeplazarEnLaDireccionCorrecta() {

        ArgumentCaptor<Direccion> posicionCaptor = ArgumentCaptor.forClass(Direccion.class);

        Mockito.doNothing().when(sectorDibujo).actualizarPosicionPersonaje(posicionCaptor.capture());

        bloqueMovimiento.accion(sectorDibujo);

        Direccion direccion = posicionCaptor.getValue();

        Assertions.assertEquals(Direccion.abajo(), direccion);

    }

}
