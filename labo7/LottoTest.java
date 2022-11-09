package labo7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LottoTest {
    @Test
    void testCompterNumerosGagnants() {
        assertArrayEquals(new int[] {4, 1}, Lotto.compterNumerosGagnants(new int[] {1, 11, 15, 20, 23, 30, 34}, new int[] {1, 12, 23, 34, 15, 22}));
    }

    @Test
    void testDeterminerRang() {
        assertEquals(1, Lotto.determinerRang(new int[] {6, 0}));
        assertEquals(2, Lotto.determinerRang(new int[] {5, 1}));
        assertEquals(3, Lotto.determinerRang(new int[] {5, 0}));
        assertEquals(4, Lotto.determinerRang(new int[] {4, 1}));
        assertEquals(5, Lotto.determinerRang(new int[] {4, 0}));
        assertEquals(6, Lotto.determinerRang(new int[] {3, 1}));
        assertEquals(7, Lotto.determinerRang(new int[] {3, 0}));
        assertEquals(8, Lotto.determinerRang(new int[] {2, 1}));
    }

    @Test
    void testObtenirGain() {
        assertEquals(500000.00, Lotto.obtenirGain(1));
        assertEquals(75000.00, Lotto.obtenirGain(2));
        assertEquals(1500.00, Lotto.obtenirGain(3));
        assertEquals(250.00, Lotto.obtenirGain(4));
        assertEquals(30.00, Lotto.obtenirGain(5));
        assertEquals(10.00, Lotto.obtenirGain(6));
        assertEquals(5.00, Lotto.obtenirGain(7));
        assertEquals(3.00, Lotto.obtenirGain(8));
    }
}
