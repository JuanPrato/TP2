package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.bloque.BloqueMovimiento;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class BloqueMovimientoTest {

    private BloqueMovimiento bloqueMovimiento;

    @Mock
    private Personaje personaje = Mockito.mock(Personaje.class);

    @BeforeEach
    void setUp() {
        bloqueMovimiento = new BloqueMovimiento(1, 1);
    }

    @Test
    void mePideDesplazarLaCantidadQueSeLeAsigna() {

        ArgumentCaptor<Integer> posicionCaptor = ArgumentCaptor.forClass(Integer.class);

        Mockito.doNothing().when(personaje).mover(posicionCaptor.capture(), posicionCaptor.capture());

        bloqueMovimiento.accion(personaje);

        List<Integer> posicion = posicionCaptor.getAllValues();

        Assertions.assertEquals(1, posicion.get(0));

        Assertions.assertEquals(1, posicion.get(1));

    }

}
