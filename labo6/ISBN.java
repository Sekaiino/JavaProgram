package labo6;

import io.Console;
import java.util.regex.Pattern;

/**
 * Ce programme permet de vérifier la validité d'un numéro ISBN.
 * Il contient cependant 3 erreurs logiques que vous devez déceler
 * à l'aide du débogueur d'Eclipse, puis corriger.
 *
 * @author Arnaud Comblin
 */
public class ISBN {
	
	/**
	 * Programme principal.
	 */
	public static void main(String[] args) { 
		/* Variable pour l'acquisition */
        String isbn;
		
		/* Variable de travail */
		boolean valide;

		/* Acquisition */
		System.out.print("Numéro ISBN ? "); // Par exemple, 2-266-11156-6
		isbn = Console.lireString();
		while (!formatIsbnValide(isbn)) {
			System.out.println("Format incorrect !");
			System.out.print("Numéro ISBN ? ");
			isbn = Console.lireString();
		} 
		
		/* Traitement */
        valide = isbnValide(isbn);

		/* Affichage du résultat */
		if (valide == true) {
			System.out.println("Ce numéro ISBN est valide");
		} else {
			System.out.println("Ce numéro ISBN n'est pas valide !");
		}
    }
	
	/**
	 * Vérifie si le format du numéro ISBN est valide.
	 * <p>
	 * Un code ISBN contient 4 segments séparés par des tirets :
	 * </p>
	 * <ul>
	 * 	<li>un identifiant pour la région de publication (par exemple, 2 pour les pays francophones)</li>
	 * 	<li>un identifiant pour l'éditeur</li>
	 * 	<li>le numéro d'ordre de l'ouvrage chez l'éditeur</li>
	 * 	<li>un chiffre de contrôle 0, 1, 2, ..., 9 ou X (représente le nombre 10)</li>
	 * </ul>
	 *
	 * @param  isbn  le numéro ISBN
	 * @return       vrai si le format ISBN est respecté, faux dans le cas contraire
	 */
	public static boolean formatIsbnValide(String isbn) {
		return isbn.length() == 13 && Pattern.matches("\\d{1,5}-\\d{1,7}-\\d{1,7}-[0-9X]", isbn);
	}
	
	/**
	 * Vérifie si un numéro ISBN est valide.
	 * <p>
	 * Un code ISBN est valide si la somme pondérée de ses 10 chiffres 
	 * chiffre_0 * 1 + chiffre_1 * 2 + chiffre_2 * 3 + ... + chiffre_9 * 10
	 * est un multiple de 11. chiffre_0 est le 1er chiffre en partant de la droite
	 * et chiffre_9 est le 1er chiffre en partant de la gauche.
	 * </p>
	 * <p>
	 * Par exemple, 2-266-11156-6 est un numéro ISBN valide puisque
	 * 6 * 1 + 6 * 2 + 5 * 3 + 1 * 4 + 1 * 5 + 1 * 6 + 6 * 7 + 6 * 8 + 2 * 9 + 2 * 10
	 * donne 176 qui est un multiple de 11.
	 * </p>
	 * <p>
	 * Le 1er chiffre en partant de la droite d'un numéro ISBN est appelé la clé de
	 * contrôle car la valeur de ce dernier dépend des valeurs des autres chiffres.
	 * La valeur de ce chiffre peut être 10. Il est dès lors représenté par un X.
	 * </p>
	 *
	 * @param  isbn  le numéro ISBN
	 * @return       vrai si le numéro ISBN est valide, faux dans le cas contraire
	 */
	public static boolean isbnValide(String isbn) {
		// Retirer les tirets du numéro ISBN
		String isbnSansTirets = isbn.replaceAll("-", "");
		
		// Retirer le chiffre de contrôle du numéro ISBN
		String isbnSansChiffreControle = isbnSansTirets.substring(0, 9);
		char chiffreControle = isbnSansTirets.charAt(9);
		
		// Obtenir la valeur du chiffre de contrôle
		int nombreControle;
		if (chiffreControle == 'X') {
			nombreControle = 10;
		} else {
			nombreControle = Character.digit(chiffreControle, 10);
		}
		
		// Calculer la somme pondérée des chiffres, de droite à gauche
        int somme = nombreControle;
		int j = 2;
		for (int i = 8; i >= 0; i--) {
			int chiffre = Character.digit(isbnSansChiffreControle.charAt(i), 10);
			somme += chiffre * j;
            j++;
        }
		return somme % 11 == 0;
	}
	
}
