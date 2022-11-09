package labo6;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class VigenereTests {
    @Test
    void testCleValide() {
        assertTrue(Vigenere.cleValide("Bond007"));

        assertFalse(Vigenere.cleValide("^/Bond007"));
    }

    @Test
    void testDecalerChar() {
        assertEquals('C', Vigenere.decaler('A', 2, 'A', 'Z'));
        assertEquals('A', Vigenere.decaler('X', 3, 'A', 'Z'));
        assertEquals('Y', Vigenere.decaler('C', -4, 'A', 'Z'));
        assertEquals('Y', Vigenere.decaler('Y', 2, 'A', 'M'));
    }

    @Test
    void testDecalerString() {
        assertEquals("CD E", Vigenere.decaler("AB C", new int[] { 2 }, 'A', 'Z'));
        assertEquals("Y AA", Vigenere.decaler("X YZ", new int[] { 1, 2 }, 'A', 'Z'));
    }

    @Test
    void testCalculerDecalage() {
        Arrays.equals(new int[] {1, 14, 13, 3, 0, 0, 7}, Vigenere.calculerDecalage("Bond007"));
    }

    @Test
    void testMultiplier() {
        Arrays.equals(new int[] {-1, -14, -13, -3}, Vigenere.multiplier(new int[] { 1, 14, 13, 3 }, -1));
    }
}
