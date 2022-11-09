package labo2;

public class Telechargement {
    public static void main(String[] args) {
        // Variables de calcul
        double dureeEnSec;
        // Variables d'acquisition
        double taille, debit;
        String nom;
        // Variables de retour
        double h, m, s;

        // Acquisition des données
        System.out.print("Nom du fichier ? ");
        nom = prb.Console.lireString();
        System.out.print("Taille du fichiers en Mo ? ");
        taille = prb.Console.lireDouble();
        System.out.print("Débit en Mbps ? ");
        debit = prb.Console.lireDouble();

        // Calcul du temps de dl
        dureeEnSec = taille / (debit / 8);
        h = dureeEnSec / 3600;
        dureeEnSec = dureeEnSec % 3600;
        m = dureeEnSec / 60;
        s = dureeEnSec % 60;

        // Affichage des résultats
        System.out.printf("Temps de téléchargement du fichier \"%s\" : %d heures %d minutes %d secondes\n", nom, (int)h, (int)m, (int)s);
    }
}
