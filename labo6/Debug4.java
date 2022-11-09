package labo6;

import io.Console;

public class Debug4 {

	public static void main(String[] args) {
		
		System.out.print("Un entier positif ? ");
		int nombre = Console.lireInt();
		
		String chaine = String.valueOf(nombre);
		int produit = 1;
		for (int i = 0; i < chaine.length(); i++) {
			produit = produit * (int)chaine.charAt(i);
		}

		System.out.println("produit = " + produit);
	}

}
