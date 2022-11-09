package labo6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ISBNTests {
    @Test
    void testIsbnValide() {
        assertTrue(ISBN.isbnValide("2-266-11156-6"));
        assertTrue(ISBN.isbnValide("2-940199-61-2"));

        assertFalse(ISBN.isbnValide("2-940199-61-1"));
    }
}
