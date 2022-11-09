package labo6;

import java.util.regex.Pattern;

public class Vigenere {
    public static boolean chiffre(char car) {
        return car >= '0' && car <= '9';
    }

    public static boolean lettreAlphaMajuscule(char car) {
        return car >= 'A' && car <= 'Z';
    }

    public static boolean lettreAlphaMinuscule(char car) {
        return car >= 'a' && car <= 'z';
    }

    public static boolean cleValide(String cle) {
        return Pattern.matches("[A-Za-z0-9]+", cle);
    }

    public static char decaler(char car, int decalage, char min, char max) {
        if (car >= min && car <= max) {
			car = (char)(car + decalage);
			if (car > max) {
				car = (char)(car - (max - min + 1)); 
			} else if (car < min) {
				car = (char)(car + (max - min + 1));
			}
		}
		return car;
    }

    public static String decaler(String chaine, int[] decalage, char min, char max) {
        String decal = "";
		for (int i = 0, j = 0; i < chaine.length(); i++) {
			if (chaine.charAt(i) >= min && chaine.charAt(i) <= max) {
				decal += decaler(chaine.charAt(i), decalage[j], min, max);
				j = (j + 1) % decalage.length;
			} else {
				decal += chaine.charAt(i);
			}
		}
        return decal;
    }

    public static int[] calculerDecalage(String chaine) {
		int[] decalages = new int[chaine.length()];
		for (int i = 0; i < chaine.length(); i++) {
			if (chiffre(chaine.charAt(i))) {
				decalages[i] = chaine.charAt(i) - '0';
			} 
            else if (lettreAlphaMajuscule(chaine.charAt(i))) {
				decalages[i] = chaine.charAt(i) - 'A';
			} 
            else if (lettreAlphaMinuscule(chaine.charAt(i))) {
				decalages[i] = chaine.charAt(i) - 'a';
			} else {
				decalages[i] = 0;
			}
		}
		return decalages;
    }

    public static String chiffrer(String message, String cle) {
        String msgChiffre = null;
        if(cleValide(cle)) {
            msgChiffre = decaler(message.toUpperCase(), calculerDecalage(cle), 'A', 'Z');
        }
        return msgChiffre;
    }

    public static int[] multiplier(int[] t, int facteur) {
        int[] mult = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            mult[i] = t[i] * facteur;
        }
        return mult;
    }

    public static String dechiffrer(String message, String cle) {
        String msgDechiffre = null;
		if (cleValide(cle)) {
			msgDechiffre = decaler(message.toUpperCase(), multiplier(calculerDecalage(cle),  -1), 'A', 'Z');
		}
		return msgDechiffre;
    }
}
