package prb;

public class Bulletin {
    public static void main(String[] args) {
        // Variables résultats
        double noteGlobale, pcts;

        // Constantes
		final int HEURES_ANGL = 4;
		final int HEURES_FRAN = 5;
		final int HEURES_GEO  = 2;
		final int HEURES_MATH = 6;

        int totalHeure = HEURES_ANGL + HEURES_FRAN + HEURES_GEO + HEURES_MATH;

        // Variables pour les données de départ
		double noteAngl =  3;
		double noteFran = 18;
		double noteGeo  = 12.5;
		double noteMath = 10;

        // Calcul de la moyenne sur 20
        noteGlobale = noteAngl * HEURES_ANGL / totalHeure;
        noteGlobale += noteFran * HEURES_FRAN / totalHeure;
        noteGlobale += noteGeo * HEURES_GEO / totalHeure;
        noteGlobale += noteMath * HEURES_MATH / totalHeure;

        // Pourcentage
        pcts = noteGlobale / 20 * 100;

        // Affichage des résultats
        System.out.print(noteGlobale);        
        System.out.println(" sur 20");        
        System.out.print(pcts);        
        System.out.println("%");        
    }
}
