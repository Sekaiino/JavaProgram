package labo6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Debug6Tests {
    @Test
    void testEnleverCaractereNonAlphanumeriques() {
        assertEquals("0497123456", Debug6.enleverCaracteresNonAlphanumeriques("0497/12.34.56"));
        assertEquals("1ABC123", Debug6.enleverCaracteresNonAlphanumeriques("1-ABC-123"));
        assertEquals("0497123456", Debug6.enleverCaracteresNonAlphanumeriques("0497 / 12  34  56"));
    }
}
