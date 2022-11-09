package labo6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Debug7Tests {
    @Test
    void testRacineEntiere() {
        assertEquals(4, Debug7.racineEntiere(16));
        assertEquals(9, Debug7.racineEntiere(81));
        assertEquals(4, Debug7.racineEntiere(19));
    }
}
