package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InstallationJUnitTests {

	@Test
	void testInstallationJUnit() {
		assertTrue(true);
		afficherMsg("Bravo ! JUnit est opérationnel.");
	}

	void afficherMsg(String msg) {
		final int LG_MSG = msg.length();
		String chaine = "";
		chaine += String.format("+%s+\n", "-".repeat(LG_MSG + 2));
		chaine += String.format("| %s |\n", msg);
		chaine += String.format("+%s+\n", "-".repeat(LG_MSG + 2));
		System.out.println(chaine);
	}

}
