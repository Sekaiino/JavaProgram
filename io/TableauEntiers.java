package io;

public class TableauEntiers {
    public static boolean contient(int[] tableau, int a) {
        for(int b : tableau) {
            if(b == a) {
                return true;
            }
        }
        return false;
    }

    public static void permuter(int[] tableau, int i, int j) {
		int element = tableau[i];
		tableau[i] = tableau[j];
		tableau[j] = element;
	}

    public static String toString(int[] tableau) {
		String affichage = "";
		
		for(int i = 0; i < tableau.length; i++) {
			if(i != tableau.length - 1) {
				affichage += tableau[i] + ", ";
			} else {
				affichage += tableau[i];
			}
		}
		
		return affichage;
    }
}
