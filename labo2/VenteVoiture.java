package labo2;

public class VenteVoiture {
    public static void main(String[] args) {
        double tva, htva, rem;

        System.out.print("Montant HTVA de la voiture ? ");
        htva = prb.Console.lireDouble();

        tva = htva * 0.21;
        rem = (tva + htva) * 0.03;

        System.out.printf("Montant de la TVA: %f\nMontant de la remise: %f\nMontant final: %f\n", tva, rem, htva + tva - rem);

    }
}
