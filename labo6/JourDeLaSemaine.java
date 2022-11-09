package labo6;

public class JourDeLaSemaine {
    public static String nomJour(int numero) {
        switch(numero) {
            case 0:
                return "dimanche";
            case 1:
                return "lundi";
            case 2:
                return "mardi";
            case 3:
                return "mercred";
            case 4:
                return "jeudi";
            case 5:
                return "vendredi";
            case 6:
                return "samedi";
            default:
                return null;
        }
    }
    public static int numeroJour(int jour, int mois, int annee) {
        int anneeEnCours, a, b, m;

        anneeEnCours = (14 - mois) / 12;
		a = annee - anneeEnCours;
		b = a + a / 4 - a / 100 + a / 400;
		m = mois + 12 * anneeEnCours - 2;
		return (jour + b + 31 * m / 12) % 7;
    }
}
