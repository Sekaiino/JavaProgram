package labo7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CompteurBinaireTest {
    @Test
    void testAjouterUn() {
        int[] t = new int[] {0, 1, 0, 1, 1};
        CompteurBinaire.ajouterUn(t);
        assertArrayEquals(new int[] {0, 1, 1, 0, 0}, t);
    }
    @Test
    void testAjouterUnAZero() {
        int[] t = new int[] {0, 0, 0, 0, 0};
        CompteurBinaire.ajouterUn(t);
        assertArrayEquals(new int[] {0, 0, 0, 0, 1}, t);
    }
    @Test
    void testAjouterUnA31() {
        int[] t = new int[] {1, 1, 1};
        CompteurBinaire.ajouterUn(t);
        assertArrayEquals(new int[] {0, 0, 0}, t);
    }
    @Test
    void testConcatener() {
        assertEquals("01011", CompteurBinaire.concatener(new int[] {0, 1, 0, 1, 1}));
    }
}
