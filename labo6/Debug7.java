package labo6;

import io.Console;

public class Debug7 {

	public static void main(String[] args) {

		int a, resultatAttendu, resultatObtenu;

		System.out.print("Un entier positif ? ");
		a = Console.lireInt();

		resultatAttendu = (int) Math.sqrt(a);
		resultatObtenu = racineEntiere(a);

		System.out.println("Résultat attendu = " + resultatAttendu);
		System.out.println("Résultat obtenu  = " + resultatObtenu);
	}

	/**
	 * Retourne la racine carrée entière d'un nombre entier.
	 * 
	 * @param n le nombre pour lequelle la racine carrée doit être obtenue.
	 * @return la racine carrée entière.
	 */
	public static int racineEntiere(int n) {
		return (int)Math.sqrt((double)n);
	}

}
