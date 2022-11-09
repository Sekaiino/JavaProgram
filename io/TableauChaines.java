package io;

public class TableauChaines {
	public static void permuter(String[] tableau, int i, int j) {
		
		String element = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = element;
	}
	
	public static void melanger(String[] tableau) {
		
		for (int i = 0; i < tableau.length; i++) {
			
			int aleat = Aleatoire.aleatoire(0, tableau.length - 1);
			permuter(tableau, i, aleat);
		}
	}
	
	public static String toString(String[] tableau, int nbElements) {
		String affichage = "";
		
		for(int i = 0; i < nbElements; i++) {
			if(i != nbElements - 1) {
				affichage += tableau[i] + ", ";
			} else {
				affichage += tableau[i];
			}
		}
		
		return affichage;
	}

	public static boolean contient(String[] t, String chaine) {
		for (String s : t) {
			if(s != null && s.equals(chaine)) {
				return true;
			}
		}
		return false;
	}

	public static String[] ajouterElement(String[] t, String element) {
		String newArray[] = new String[t.length + 1];
				
		System.arraycopy(t, 0, newArray, 0, t.length);  
		newArray[newArray.length - 1] = element;
		return newArray;
	}
}
