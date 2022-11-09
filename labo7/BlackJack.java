package labo7;

import io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class BlackJack {
    public static void main(String[] args) {
		
		int ptJoueur, ptCroupier;
		
		char choix;
		
		String[] jeuDeCartes = getJeuDeCartes();
		TableauChaines.melanger(jeuDeCartes);
		
		// Create List<String> to be able to add content into List
		List<String> cartesJoueur = new ArrayList<String>();
		cartesJoueur.add(jeuDeCartes[0]);
		cartesJoueur.add(jeuDeCartes[2]);
		List<String> cartesCroupier = new ArrayList<String>();
		cartesCroupier.add(jeuDeCartes[1]);
		cartesCroupier.add(jeuDeCartes[3]);
		
		// Since 4 cards are distributed, we must start at index 4 in the cards array
		int i = 4;
		
		// Create array from List<String> and get player points
		String[] cartesJoueurArray = cartesJoueur.toArray(new String[cartesJoueur.size()]);
		String[] cartesCroupierArray = cartesCroupier.toArray(new String[cartesCroupier.size()]);
		ptJoueur = getValeurCartes(cartesJoueurArray, 2);
		ptCroupier = getValeurCartes(cartesCroupierArray, 2);
		
		// If 21 first round, stop the game and define the winner
		if(ptJoueur == 21 || ptCroupier == 21) {
			affichageResultats(ptJoueur, cartesJoueurArray, 'j');
			affichageResultats(ptCroupier, cartesCroupierArray, 'c');
			
			if(ptJoueur == 21 && ptCroupier == 21) {
				System.out.println("Egalité !");
			}
			else if(ptJoueur == 21) {
				System.out.println("Vous gagnez !");
			} else {
				System.out.println("Vous perdez !");
			}
			return;
		}
		
		// Entry loop
		while(true) {
			
			// Print result of points (IA only first time)
			affichageResultats(ptJoueur, cartesJoueurArray, 'j');
			
			if(i == 4) {
				System.out.printf("Le croupier a %d points :\n", getValeurCarte(cartesCroupierArray[1]));
				System.out.println(cartesCroupierArray[1]);
				System.out.println();
			}
			
			// Ask if the player want to get a card
			System.out.print("Tirer une carte ? (O)ui/(N)on ");
			choix = Character.toLowerCase(Console.lireChar());
			
			// if yes, continue loop and add card to the List<String>
			switch(choix) {
				case 'o':
					// Add card to the player
					cartesJoueur.add(jeuDeCartes[i]);
					cartesJoueurArray = cartesJoueur.toArray(new String[cartesJoueur.size()]);
					ptJoueur = getValeurCartes(cartesJoueurArray, cartesJoueurArray.length);
					i++;
					
					// Add card to the IA only if score below 17
					if(ptCroupier < 17) {
						cartesCroupier.add(jeuDeCartes[i]);
						cartesCroupierArray = cartesCroupier.toArray(new String[cartesCroupier.size()]);
						ptCroupier = getValeurCartes(cartesCroupierArray, cartesCroupierArray.length);
						i++;
					}
					
					// Check if player score or IA score > 21
					if(ptCroupier >= 21 || ptJoueur >= 21) {
						choix = 'n';
					} else {
						break;
					}
					
					
				case 'n':
					// Print results
					affichageResultats(ptJoueur, cartesJoueurArray, 'j');
					affichageResultats(ptCroupier, cartesCroupierArray, 'c');
					
					// Decide the winner
					if(ptJoueur == ptCroupier) {
						System.out.println("Egalité !");
					}
					else if(ptJoueur > 21 || (ptCroupier > ptJoueur && ptCroupier <= 21)) {
						System.out.println("Vous perdez !");
					} else {
						System.out.println("Vous gagnez !");
					}
					return;
					
				default:
					System.out.println("An error occured when adding cards");
			}
		}
	}

    private static String[] getJeuDeCartes() {
		// Constantes
		final String[] COULEURS = { "coeur", "carreau", "trèfle", "pique" };
		final String[] CARTES = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As" };
		
		// Variable pour le résultat
		String[] jeuDeCartes;
		
		// Créer un jeu de cartes
		jeuDeCartes = new String[COULEURS.length * CARTES.length];
		
		for (int i = 0; i < COULEURS.length; i++) {
			for (int j = 0; j < CARTES.length; j++) {
				jeuDeCartes[CARTES.length * i + j] = CARTES[j] + " de " + COULEURS[i];
			}
		}
		
		// Retourner le jeu de cartes
		return jeuDeCartes;
	}

    public static int getValeurCarte(String carte) {
		
		int index = carte.indexOf(" ");
		
		if(index == 1) {
			return Character.digit(carte.charAt(0), 10);
		}
		else if(Pattern.matches("As", carte.substring(0, index))) {
			return 11;
		}
		else {
			return 10;
		}
	}
	
	
	public static int getValeurCartes(String[] cartes, int nbCartes) {
		
		int value = 0;
		
		for(int i = 0; i < nbCartes; i++) {
			value += getValeurCarte(cartes[i]);
		}
		return value;
	}
	
	
	private static void affichageResultats(int pt, String[] cartes, char choice) {
		if(choice == 'c') {
			System.out.printf("Vous avez %d points :\n", pt);			
		} else if(choice == 'j') {
			System.out.printf("Le croupier a %d points :\n", pt);			
		}
		else {
			System.out.println("Error");
		}
		System.out.println(TableauChaines.toString(cartes, cartes.length));
		System.out.println();
	}
}
