package labo3;

public class DetailEmprunt {
    public static void main(String[] args) {
        double tm, m;

        System.out.print("Capital ? ");
        //double c = prb.Console.lireDouble();
        double c = 25000;

        System.out.print("Taux annuel en % ? ");
        //double ta = prb.Console.lireDouble();
        double ta = 3.04;

        System.out.print("Durée en année ? ");
        //int secondYear = prb.Console.lireInt();
        int year = 20;
        System.out.println("\n");

        tm = Emprunt.calculerTauxMensuel(ta / 100);
        m = Emprunt.calculerMensualite(c, year * 12, tm);

        System.out.printf("Taux d'intérêt mensuel = %f\n", tm * 100);
        System.out.printf("Nombre de paiements    = %d\n", year * 12);
        System.out.printf("Remboursement mensuel  = %.2f EUR\n\n", m);

        for(int i = 0; i < 4; i++) {
            if(i == 0) {
                System.out.printf("Capital à emprunter = %.2f EUR\n", c);
                System.out.printf("Total remboursé     = %.2f EUR\n", m * year * 12);
                System.out.printf("Intérêts prêt       = %.2f EUR\n\n", m * year * 12 - c);

            } else {
                double solde = Emprunt.calculerSoldeCapital(m, (year * 12) - (i * 12), tm);

                System.out.printf("Année %d\n", i);
                System.out.printf("Solde du capital    = %.2f EUR\n", solde);
                System.out.printf("Capital remboursé   = %.2f EUR\n", c - solde);
                System.out.printf("Intérêts remboursés = %.2f EUR\n\n", 12 * m - (c - solde));
            }
        }
    }
}
