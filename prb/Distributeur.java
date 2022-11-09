package prb;

public class Distributeur {
    public static void main(String[] args) {
        // Variable de départ
        int montant;
        final int[] billet = { 200, 100, 50, 20, 10 };

        // Variables résultats
        int nbBillets;

        // Acquisition du montant à retirer
        System.out.print("Montant à retirer ? ");
        montant = Console.lireInt();

        // Process
        for(int i=0; i < billet.length; i++) {

            // Calcul du nombre de billet
            nbBillets = montant / billet[i];
            montant = montant % billet[i];

            if(nbBillets != 0) {
    
                // Affichage des résultats
                System.out.printf("Nombre de billets de %d = %d\n", billet[i], nbBillets);
            }
        }
    }
}
