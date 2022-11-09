package labo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NormeVecteurTests {

	// public static double calculerNormeVecteur(double a, double b)
	
	@Test
	void testCalculerNormeVecteur() {
		assertEquals(0.0, NormeVecteur.calculerNormeVecteur(0, 0), 0.05);
		assertEquals(7.125, NormeVecteur.calculerNormeVecteur(0.000, -7.125), 0.0005);
		assertEquals(7.125, NormeVecteur.calculerNormeVecteur(7.125,  0.000), 0.0005);
		assertEquals(6.4, NormeVecteur.calculerNormeVecteur( 5,  4), 0.05);
		assertEquals(6.4, NormeVecteur.calculerNormeVecteur( 5, -4), 0.05);
		assertEquals(6.4, NormeVecteur.calculerNormeVecteur(-4,  5), 0.05);
		assertEquals(6.4, NormeVecteur.calculerNormeVecteur(-4, -5), 0.05);
	}

}
