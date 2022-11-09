package io;

/**
 * Cette classe propose différents fonctions permettant de générer
 * des nombres pseudo-aléatoires.
 *
 * @author Arnaud Comblin
 * @version 1.0
 */
public class Aleatoire {
	
	/**
	 * Retourne un nombre compris entre 0 et Integer.MAX_VALUE inclus.
	 * 
	 * @return  un nombre
	 */
	public static int aleatoire() {
		return aleatoire(Integer.MAX_VALUE);
	}

	/**
	 * Retourne un nombre aléatoire compris entre 0 et une borne supérieure inclusive.
	 * 
	 * @param  sup  la borne supérieure inclusive
	 * @return      un nombre
	 */
	public static int aleatoire(int sup) {
		return aleatoire(0, sup);
	}
	
	/**
	 * Retourne un nombre aléatoire compris entre une borne inférieure et une borne
	 * supérieure inclusives.
	 * 
	 * @param  inf  la borne inférieure
	 * @param  sup  la borne supérieure inclusive
	 * @return      un nombre
	 */
	public static int aleatoire(int inf, int sup) {
		return (int)((long)(Math.random() * (1L + sup - inf)) + inf);
	}
	
}
