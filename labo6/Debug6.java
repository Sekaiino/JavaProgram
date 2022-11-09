package labo6;

import io.Console;

public class Debug6 {

	public static void main(String[] args) {

		String numTel;

		System.out.print("Numéro de téléphone ? ");
		numTel = Console.lireString();
		
		numTel = enleverCaracteresNonAlphanumeriques(numTel);
		
		System.out.println(numTel);
	}

	/**
	 * Retourne une chaîne de caractères de laquelle tous les caractères non
	 * alphanumériques ont été retirés.
	 * 
	 * @param chaine la chaîne de caractères à traiter.
	 * @return la chaîne de caractères avec uniquement des caractètres
	 *         alphanumériques.
	 */
	public static String enleverCaracteresNonAlphanumeriques(String chaine) {
		return chaine.replaceAll("[^\\da-zA-Z]", "").replace(" ", "");
	}

}
