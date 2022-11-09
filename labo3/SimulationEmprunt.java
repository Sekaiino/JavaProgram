package labo3;

public class SimulationEmprunt {
    public static void main(String[] args) {
        double tm;

        System.out.print("Capital ? ");
        double c = prb.Console.lireDouble();

        System.out.print("Taux annuel en % ? ");
        double ta = prb.Console.lireDouble();

        System.out.print("Durée 1 en année ? ");
        int firstYear = prb.Console.lireInt();

        System.out.print("Durée 2 en année ? ");
        int secondYear = prb.Console.lireInt();

        System.out.printf("Capital à emprunter = %.2f EUR\n", c);

        tm = Emprunt.calculerTauxMensuel(ta / 100);
        System.out.printf("Taux d'intérêt mensuel = %f%%\n\n", tm * 100);

        afficherSimulationEmprunt(c, firstYear, tm);
        afficherSimulationEmprunt(c, secondYear, tm);
    }

    private static void afficherSimulationEmprunt(double c, int tps, double tm) {
        double mensualite = Emprunt.calculerMensualite(c, tps * 12, tm);
        double tot = mensualite * (tps * 12);

        System.out.printf("Sur %d ans :\n", tps);
        System.out.printf("Nombre de paiements = %d\n", tps * 12);
        System.out.printf("Remboursement mensuel = %.2f EUR\n", mensualite);
        System.out.printf("Total remboursé = %.2f EUR\n", tot);
        System.out.printf("Intérêts prêt = %.2f EUR\n\n", tot - c);
    }
}
