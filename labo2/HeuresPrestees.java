package labo2;

public class HeuresPrestees {
    public static void main(String[] args) {
        // Constantes
        final String[] jour = {"lundi", "mardi", "mercredi", "jeudi", "vendredi"};
        final double prix = 18.75;

        // Variables d'acquisition
        String heuresPrestees;

        // Variables de process et retour
        int index, h=0, m=0;
        double facture;

        for (int i = 0; i < jour.length; i++) {
            System.out.printf("Prestations du %s ? ", jour[i]);
            heuresPrestees = prb.Console.lireString();

            index = heuresPrestees.indexOf(":");
            h += Integer.parseInt(heuresPrestees.substring(0, index));
            m += Integer.parseInt(heuresPrestees.substring(index + 1, heuresPrestees.length()));

            if (m > 60) {
                h += 1;
                m -= 60;
            }
        }
        System.out.printf("\nDurée hebdomadaire = %d:%d\n", h, m);

        facture = h * prix + (prix / 60. * m);
        System.out.printf("Montant à facturer : %.2f €\n", facture);
    }
}