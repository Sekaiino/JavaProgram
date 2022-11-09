package labo3;

/**
 * Cette classe est créée pour calculer le taux d'une mensualité, une mensualité ou un solde de capital
 * @author Enzo
 * @version 1.0
 */
public class Emprunt {
    /**
     * Calcul le taux d'une mensualité
     * @param ta taux annuel
     * @return taux d'une mensualité
     */
    public static double calculerTauxMensuel(double ta) {
        return (Math.pow((1 + ta), (1./12))) - 1;
    }

    /**
     * Calcul une mensualité
     * @param c capital
     * @param n nombre de mois
     * @param tm taux mensuel
     * @return mensualité en EUR
     */
    public static double calculerMensualite(double c, int n, double tm) {
        return c * (tm / (1 - Math.pow((1 + tm), -n)));
    }

    /**
     * Calcul le solde d'un capital
     * @param m mensualité
     * @param n nombre de mois
     * @param tm taux mensuel
     * @return solde du capital
     */
    public static double calculerSoldeCapital(double m, int n, double tm) {
        return m * ((1 - Math.pow((1 + tm), -n)) / tm);
    }
}
