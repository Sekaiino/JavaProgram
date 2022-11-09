package labo8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompetitionSportiveTest {
    @Test
    public void testJourneeSuivante4EquipesJ1() {
        String[][] expected = { { "A", "C" }, { "D", "B" } };
        String[] nomsEquipes = { "A", "B", "C", "D" };
        assertArrayEquals(expected, CompetitionSportive.journeeSuivante(nomsEquipes));
    }
}
