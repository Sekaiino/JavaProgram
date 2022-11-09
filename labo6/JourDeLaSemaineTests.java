package labo6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JourDeLaSemaineTests {
    @Test
    public void testNomJour1() {
        assertEquals("lundi", JourDeLaSemaine.nomJour(1));
    }
    @Test
    public void testNomJour7() {
        assertEquals(null, JourDeLaSemaine.nomJour(7));
    }
}
