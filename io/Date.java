package io;

import java.time.LocalDateTime;

/**
 * Cette classe regroupe des traitements relatifs aux dates.
 * 
 * @author Arnaud
 */
public class Date {

	/**
	 * Retourne la date du jour.
	 * 
	 * @return un tableau de la forme [jour, mois, annee] contenant la date du jour
	 */
	public static int[] aujourdhui() {
		LocalDateTime lDT = LocalDateTime.now();
		return new int[] { lDT.getDayOfMonth(), lDT.getMonth().getValue(), lDT.getYear() };
	}

	/**
	 * Retourne la date correspondant à la date transmise plus un nombre de jours donné.
	 * 
	 * @param date
	 *            un tableau de la forme [jour, mois, annee] contenant une date
	 * @param jours
	 *            le nombre de jours à ajouter
	 * @return un tableau de la forme [jour, mois, annee] contenant la nouvelle date calculée
	 */
	public static int[] ajouterJours(int[] date, int jours) {
		LocalDateTime lDT = LocalDateTime.of(date[2], date[1], date[0], 0, 0, 0).plusDays(jours);
		return new int[] { lDT.getDayOfMonth(), lDT.getMonth().getValue(), lDT.getYear() };
	}

	/**
	 * Retourne le numéro du jour de la semaine pour la date transmise : de 1 (Lundi) à 7 (Dimanche).
	 * 
	 * @param date
	 *            un tableau de la forme [jour, mois, annee] contenant une date
	 * @return le numéro du jour de la semaine
	 */
	public static int numeroJourSemaine(int[] date) {
		return LocalDateTime.of(date[2], date[1], date[0], 0, 0, 0).getDayOfWeek().getValue();
	}

	/**
	 * Retourne le nom du jour de la semaine.
	 * 
	 * @param numero
	 *            le numéro du jour de la semaine : de 1 (Lundi) à 7 (Dimanche)
	 * @return le nom du jour de la semaine
	 */
	public static String nomJourSemaine(int numero) {
		final String[] NOMS_JOURS = { "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche" };
		String nomJour = null;
		if (numero >= 1 && numero <= 7) {
			nomJour = NOMS_JOURS[numero - 1];
		}
		return nomJour;
	}

	/**
	 * Retourne le nom du jour de la semaine.
	 * 
	 * @param date
	 *            un tableau de la forme [jour, mois, annee] contenant une date
	 * @return le nom du jour de la semaine
	 */
	public static String nomJourSemaine(int[] date) {
		return nomJourSemaine(numeroJourSemaine(date));
	}

}
