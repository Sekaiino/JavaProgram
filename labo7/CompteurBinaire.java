package labo7;

import io.Console;

public class CompteurBinaire {
    public static void main(String[] args) {
        // Obtenir le nombre de bits pour définir la taille du tableau
        System.out.print("Combien de bits ? ");
        int nbBits = Console.lireInt();
        
        // Déclarer le tableau de départ(initialisation automatique à 0)
        int[] tableauBits = new int[nbBits];

        // Entrée en boucle pour afficher les données
        while(concatener(tableauBits).contains("0")) {
            System.out.println(concatener(tableauBits));
            ajouterUn(tableauBits);
        }
        System.out.println(concatener(tableauBits));
    }

    /**
     * Fonction permettant d'ajouter 1 à un tableau représentant une chaîne binaire
     * @param t tableau d'entiers contenant la chaîne binaire
     * @return tableau augmenter de un
     */
    public static int[] ajouterUn(int[] t) {
        for (int i = t.length - 1; i >= 0; i--) {
            
            t[i] = t[i] == 1 ? 0 : 1;
            
            if(t[i] == 1) {
                break;
            }
        }
        return t;
    }
    
    /**
     * Fonction permettant de concatener un tableau donné en une chaîne de caractère sans espacement
     * @param t tableau d'entiers à concaténer
     * @return chaîne de caractère du tableau d'entiers concaténer
     */
    public static String concatener(int[] t) {
        String concatenation = "";
        for (int i : t) {
            concatenation += i;
        }
        return concatenation;
    }
}
