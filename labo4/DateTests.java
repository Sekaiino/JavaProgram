package labo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTests {

	// public static boolean estBissextile(int annee)
	
	@Test
	void testEstBissextile() {
		// Années bissextiles
		assertTrue(Date.estBissextile(1992));
		assertTrue(Date.estBissextile(2000));
		assertTrue(Date.estBissextile(2004));
		assertTrue(Date.estBissextile(2008));
		assertTrue(Date.estBissextile(2012));
		assertTrue(Date.estBissextile(2016));
		assertTrue(Date.estBissextile(2020));
		assertTrue(Date.estBissextile(2024));
		assertTrue(Date.estBissextile(2396));
		assertTrue(Date.estBissextile(2400));

		// Années non bissextiles
		assertFalse(Date.estBissextile(1900));
		assertFalse(Date.estBissextile(1990));
		assertFalse(Date.estBissextile(1999));
		assertFalse(Date.estBissextile(2001));
		assertFalse(Date.estBissextile(2010));
		assertFalse(Date.estBissextile(2022));
		assertFalse(Date.estBissextile(2100));
		assertFalse(Date.estBissextile(2200));
		assertFalse(Date.estBissextile(2300));
		assertFalse(Date.estBissextile(2398));
	}

	// public static int joursParMois(int mois, int annee)
	
	@Test
	void testJoursParMois() {
		assertEquals( 0, Date.joursParMois(-1, 2021));
		assertEquals( 0, Date.joursParMois( 0, 2021));
		assertEquals(31, Date.joursParMois( 1, 2022));
		assertEquals(28, Date.joursParMois( 2, 2023));
		assertEquals(29, Date.joursParMois( 2, 2024));
		assertEquals(31, Date.joursParMois( 3, 2025));
		assertEquals(30, Date.joursParMois( 4, 2026));
		assertEquals(31, Date.joursParMois( 5, 2027));
		assertEquals(30, Date.joursParMois( 6, 2028));
		assertEquals(31, Date.joursParMois( 7, 2029));
		assertEquals(31, Date.joursParMois( 8, 2030));
		assertEquals(30, Date.joursParMois( 9, 2031));
		assertEquals(31, Date.joursParMois(10, 2032));
		assertEquals(30, Date.joursParMois(11, 2033));
		assertEquals(31, Date.joursParMois(12, 2034));
		assertEquals( 0, Date.joursParMois(13, 2035));
		assertEquals( 0, Date.joursParMois(14, 2035));
	}
	
	// public static int getJour(String date)
	
	@Test
	void testGetJour() {
		assertEquals( 1, Date.getJour("1/6/1970"));
		assertEquals(29, Date.getJour("29/2/2024"));
		assertEquals( 5, Date.getJour("5/10/1980"));
		assertEquals(31, Date.getJour("31/12/2023"));
	}
	
	// public static int getMois(String date)
	
	@Test
	void testGetMois() {
		assertEquals( 6, Date.getMois("1/6/1970"));
		assertEquals( 2, Date.getMois("29/2/2024"));
		assertEquals(10, Date.getMois("5/10/1980"));
		assertEquals(12, Date.getMois("31/12/2023"));
	}
	
	// public static int getAnnee(String date)
	
	@Test
	void testGetAnnee() {
		assertEquals(1970, Date.getAnnee("1/6/1970"));
		assertEquals(2024, Date.getAnnee("29/2/2024"));
		assertEquals(1980, Date.getAnnee("5/10/1980"));
		assertEquals(2023, Date.getAnnee("31/12/2023"));
	}
	
	// public static String formaterDate(int jour, int mois, int annee)
	
	@Test
	void testFormaterDate() {
		assertEquals("01/06/1970", Date.formaterDate( 1,  6, 1970));
		assertEquals("29/02/2024", Date.formaterDate(29,  2, 2024));
		assertEquals("05/10/1980", Date.formaterDate( 5, 10, 1980));
		assertEquals("31/12/2023", Date.formaterDate(31, 12, 2023));
	}
	
	// public static boolean estValide(String date)
	
	@Test
	void testEstValideParamString() {
		// Années avec format valide
		assertTrue(Date.estValide("1/6/1970"));
		assertTrue(Date.estValide("29/2/2024"));
		assertTrue(Date.estValide("5/10/1980"));
		assertTrue(Date.estValide("31/12/2023"));

		// Années avec format non valide
		assertFalse(Date.estValide("/6/1970"));
		assertFalse(Date.estValide("1//1970"));
		assertFalse(Date.estValide("1/6/"));
		assertFalse(Date.estValide("1/6 1970"));
		assertFalse(Date.estValide("1-6/1970"));
		assertFalse(Date.estValide("1.6.1970"));
		assertFalse(Date.estValide("1970/6/1"));
		assertFalse(Date.estValide("1/666/1970"));
		assertFalse(Date.estValide("1/6/197"));
		assertFalse(Date.estValide("1/6/19700"));
		assertFalse(Date.estValide("-1/6/1970"));
		assertFalse(Date.estValide("1/-6/1970"));
		assertFalse(Date.estValide("1/6/-1970"));
	}
	
	// public static boolean estValide(int jour, int mois, int annee)
	
	@Test
	void testEstValideParamIntIntInt() {
		// Années avec format valide
		assertTrue(Date.estValide( 1,  6, 1970));
		assertTrue(Date.estValide(28,  2, 1970));
		assertTrue(Date.estValide(29,  2, 2024));
		assertTrue(Date.estValide( 5, 10, 1980));
		assertTrue(Date.estValide(31, 12, 2023));

		// Années avec format non valide
		assertFalse(Date.estValide(-1,  6, 1970));
		assertFalse(Date.estValide( 0,  6, 1970));
		assertFalse(Date.estValide(31,  6, 1970));
		assertFalse(Date.estValide(32,  6, 1970));
		assertFalse(Date.estValide( 1, -1, 1970));
		assertFalse(Date.estValide( 1,  0, 1970));
		assertFalse(Date.estValide( 1, 13, 1970));
		assertFalse(Date.estValide( 1, 14, 1970));
		assertFalse(Date.estValide(32,  8, 1970));
		assertFalse(Date.estValide(33,  8, 1970));
		assertFalse(Date.estValide(29,  2, 1970));
		assertFalse(Date.estValide(30,  2, 1970));
		assertFalse(Date.estValide(30,  2, 1972));
		assertFalse(Date.estValide(31,  2, 1972));
	}

}
