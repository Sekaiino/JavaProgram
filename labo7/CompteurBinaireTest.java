package labo7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CompteurBinaireTest {
    @Test
    void testAjouterUn() {
        assertArrayEquals(new int[] {0, 1, 1, 0, 0}, CompteurBinaire.ajouterUn(new int[] {0, 1, 0, 1, 1}));
        assertArrayEquals(new int[] {}, CompteurBinaire.ajouterUn(new int[] {}));
        assertArrayEquals(new int[] {0, 1, 0, 0, 1}, CompteurBinaire.ajouterUn(new int[] {0, 1, 0, 0, 0}));
    }
    @Test
    void testConcatener() {
        assertEquals("01011", CompteurBinaire.concatener(new int[] {0, 1, 0, 1, 1}));
    }
}
