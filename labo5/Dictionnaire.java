package labo5;

import io.Fichier;
import java.nio.charset.*;
import java.util.*;

/**
 * Cette classe permet d'extraire des mots provenant du fichier "dictionnaire.txt"
 * placé dans le répertoire "data" de votre espace de travail.
 *
 * @author Arnaud Comblin
 * @version 1.0
 */
public class Dictionnaire {

	private final static String CHEMIN_FICHIER = "data/dictionnaire.txt"; 
	private final static Charset ENCODAGE = StandardCharsets.UTF_8;
	
	private static List<String> mots = Fichier.lireToutesLesLignes(CHEMIN_FICHIER, ENCODAGE);

	/**
	 * Retourne le mot situé à une ligne précise du fichier "dictionnaire.txt".
	 *
	 * @param  ligne  le numéro de la ligne (les lignes sont numérotées à partir de 0)
	 * @return        le mot situé à la ligne spécifiée si elle existe, null dans le cas contraire
	 */
	static String getMot(int ligne) {
		String mot = null;
		if (ligne >= 0 && ligne < taille()) {
			mot = mots.get(ligne);
		}
		return mot;
	}
	
	/**
	 * Retourne le nombre de lignes présentes dans le fichier "dictionnaire.txt".
	 *
	 * @return  le nombre de lignes
	 */
	static int taille() {
		return mots.size();
	}
	
}
