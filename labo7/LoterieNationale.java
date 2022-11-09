package labo7;

import io.Console;
import io.TableauEntiers;

public class LoterieNationale {
    public static void main(String[] args) {
        // Variables
        int[] grille = null, tirage = null, results = null;

        // Boucle
        while(true) {
            char c = userChoice(grille);
            
            while(c != '1' && c != '2' && c != '3') {
                System.out.println("Veuillez saisir une donnée correcte !\n");
                c = userChoice(grille);
            }

            if(c == '1') {
                System.out.println();
                grille = Lotto.encoderGrille(6, 45);
                System.out.println("Votre grille est: " + TableauEntiers.toString(grille));
                continue;
            }
            else if(c == '2') {
                System.out.println();
                tirage = Lotto.genererTirage(7, 45);
                System.out.println("Le tirage est: " + TableauEntiers.toString(tirage));

                if(grille == null) {
                    System.out.println("Vous n'avez pas rempli de grille\n");
                    continue;
                }
                results = Lotto.compterNumerosGagnants(tirage, grille);
                if(results[1] == 1) {
                    System.out.printf("Vous avez %d numéros gagnants et le numéro bonus\n", results[0]);
                } else {
                    System.out.printf("Vous avez %d numéros gagnants\n", results[0]);
                }
                System.out.printf("Vous avez gagné %.2f EUR\n", Lotto.obtenirGain(Lotto.determinerRang(results)));
                continue;
            }
            else if(c == '3') {
                System.out.println("Fin du programme.");
                return;
            }
        }
    }

    private static char userChoice(int[] grille) {
        System.out.println("\nLoterie Nationale");
        if(grille != null) {
            System.out.println("1. Modifier ma grille de Lotto");
        } else {
            System.out.println("1. Remplir une grille de Lotto");
        }
        System.out.println("2. Consulter mon gain pour le dernier tirage");
        System.out.println("3. Quitter");
        System.out.print("Choix ? ");
        return Character.toLowerCase(Console.lireChar());
    }
}
