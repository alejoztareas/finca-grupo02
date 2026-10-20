
package ec.edu.uagraria.finca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParcelaPruebaExtraTest {

    @Test
    void debeObtenerCodigoDeParcela() {
        Parcela parcela = new Parcela("P003", 2.0);

        assertEquals("P003", parcela.getCodigo());
    }

    @Test
    void debeCalcularAreaDeDosHectareas() {
        Parcela parcela = new Parcela("P004", 2.0);

        assertEquals(20000.0, parcela.areaEnMetrosCuadrados());
    }

    @Test
    void debeRechazarHectareasNegativas() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Parcela("P005", -1.0)
        );
    }
}

