package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Cette classe propose différentes fonctions permettant de réaliser
 * l'acquisition d'une donnée au format approprié.
 *
 * @author Arnaud Comblin
 * @version 1.2
 */
public class Console {

	private static BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

	private static LinkedBlockingQueue<String> saisies = new LinkedBlockingQueue<String>();

	/**
	 * Récupère la saisie de l'utilisateur au format String.
	 * 
	 * @return une chaîne de caractère.
	 * @since 1.0
	 */
	public static String lireString() {
		String resultat = null;
		try {
			if (saisies.isEmpty()) {
				resultat = lecteur.readLine();
			} else {
				resultat = saisies.remove();
				System.out.println(resultat);
			}
		} catch (IOException e) {
			System.err.println("Erreur dans Console.lireString");
		}
		return resultat;
	}

	/**
	 * Récupère la saisie de l'utilisateur au format char.
	 * 
	 * @return le premier caractère de la saisie si elle en contient au moins un,
	 *         '\0' dans le cas contraire.
	 * @since 1.1
	 */
	public static char lireChar() {
		char resultat = '\0';
		try {
			resultat = lireString().charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Erreur dans Console.lireChar");
		}
		return resultat;
	}

	/**
	 * Récupère la saisie de l'utilisateur au format int.
	 * 
	 * @return un entier si la valeur saisie représente un entier compris entre
	 *         -2^31 et 2^31-1, 0 dans le cas contraire.
	 * @since 1.0
	 */
	public static int lireInt() {
		int resultat = 0;
		try {
			resultat = Integer.parseInt(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireInt");
		}
		return resultat;
	}

	/**
	 * Récupère la saisie de l'utilisateur au format long.
	 * 
	 * @return un entier si la valeur saisie représente un entier compris entre
	 *         -2^63 et 2^63-1, 0 dans le cas contraire.
	 * @since 1.0
	 */
	public static long lireLong() {
		long resultat = 0l;
		try {
			resultat = Long.parseLong(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireLong");
		}
		return resultat;
	}

	/**
	 * Récupère la saisie de l'utilisateur au format float.
	 * 
	 * @return un réel si la valeur saisie représente une valeur numérique, 0 dans
	 *         le cas contraire.
	 * @since 1.0
	 */
	public static float lireFloat() {
		float resultat = 0f;
		try {
			resultat = Float.parseFloat(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireFloat");
		}
		return resultat;
	}

	/**
	 * Récupère la saisie de l'utilisateur au format double.
	 * 
	 * @return un réel si la valeur saisie représente une valeur numérique, 0 dans
	 *         le cas contraire.
	 * @since 1.0
	 */
	public static double lireDouble() {
		double resultat = 0.;
		try {
			resultat = Double.parseDouble(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireDouble");
		}
		return resultat;
	}

	/**
	 * Ajoute les chaînes de caractères à considérer comme les prochaines saisies de
	 * l'utilisateur. Lorsqu'une fonction de lecture de la classe Console est
	 * exécutée, elle consomme en priorité ces chaînes de caractères, et ce, par
	 * ordre d'ajout (FIFO).
	 * 
	 * @param saisies
	 *            les chaînes de caractères se substituant aux saisies de
	 *            l'utilisateur.
	 * @throws IllegalArgumentException
	 *             - si une référence null est fournie en tant que saisie.
	 * @since 1.2
	 */
	public static void simulerSaisies(String... saisies) {
		for (String saisie : saisies) {
			try {
				Console.saisies.add(saisie);
			} catch (NullPointerException e) {
				throw new IllegalArgumentException("Seule une chaîne de caractères est admise en tant que saisie, pas la référence null !");
			}
		}
	}

	/**
	 * Supprime toutes les chaînes de caractères se substituant aux saisies de
	 * l'utilisateur.
	 * 
	 * @since 1.2
	 */
	public static void nettoyerSaisies() {
		saisies.clear();
	}

}
