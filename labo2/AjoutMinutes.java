package labo2;

import io.Console;

public class  AjoutMinutes {
    public static void main(String[] args) {
        // Variables d'acquisition de données
        String heureDonne;
        int minutesDonne;

        // Variables de process
        int index;

        // Variables pour l'affichage final
        int h, m;

        // Acquisition des données
        System.out.print("Heure (h:m) ? ");
        heureDonne = Console.lireString();
        System.out.print("Minutes à ajouter ? ");
        minutesDonne = Console.lireInt();

        // Process
        index = heureDonne.indexOf(":");
        h = Integer.parseInt(heureDonne.substring(0, index)) + minutesDonne / 60;
        m = Integer.parseInt(heureDonne.substring(index + 1)) + minutesDonne % 60;
        // Vérifier que les minutes ne forment pas une heure entière
        if(m > 60) {
            h += 1;
            m -= 60;
        }
        // Vérifier que les heures ne forment pas une journée
        if(h > 24) {
            h -= 24;
        }

        // Affichage des résultats
        System.out.printf("Résultats = %d:%d\n", h, m);
    }
}
