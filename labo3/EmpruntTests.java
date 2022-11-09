package labo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpruntTests {

	// public static double calculerTauxMensuel(double tauxAnnuel)
	
	@Test
	void testCalculerTauxMensuel() {
		assertEquals(0.0024987, Emprunt.calculerTauxMensuel(0.0304), 5e-7);
	}

	// public static double calculerMensualite(double capital, int nbMois, double tauxMensuel)

	@Test
	void testCalculerMensualite() {
		assertEquals(138.63, Emprunt.calculerMensualite(25000, 20 * 12, 0.0024987), 5e-2);
	}
	
	// public static double calculerSoldeCapital(double mensualite, int nbMoisRestants, double tauxMensuel)

	@Test
	void testCalculerSoldeCapital() {
		assertEquals(25000.00, Emprunt.calculerSoldeCapital(138.63, 20 * 12, 0.0024987), 5e-2);
		assertEquals(24073.39, Emprunt.calculerSoldeCapital(138.63, 19 * 12, 0.0024987), 5e-2);
		assertEquals(23118.60, Emprunt.calculerSoldeCapital(138.63, 18 * 12, 0.0024987), 5e-2);
		assertEquals(22134.80, Emprunt.calculerSoldeCapital(138.63, 17 * 12, 0.0024987), 5e-2);
	}
	
}
