package labo8;

import io.*;

public class PrevisionsMeteo {
    public static void main(String[] args) {
        final int NB_JOURS = 5;

        String[] nomsLocalites = new String[0];
        double[][] temperatures = new double[0][];
        String[] jour = new String[NB_JOURS];
        String[] nomJour = new String[NB_JOURS];
        double[] tempArray = new double[NB_JOURS];
        int menu = 0;
        String localite;
        int[] date;

        while(menu != 4) {
            do {
                System.out.println("Prévisions météo");
                System.out.println("1. Ajouter une localité et ses prévisions");
                System.out.println("2. Afficher les prévisions");
                System.out.println("3. Analyser les prévisions");
                System.out.println("4. Quitter");
                System.out.print("Choix ? ");
                menu = Console.lireInt();

                if(menu < 1 || menu > 4) System.out.println("\nChoix incorrect !\n");

            } while(menu < 1 || menu > 4);

            switch(menu) {
                case 1:
                    System.out.print("\nNom de la localité ? ");
                    localite = Console.lireString();
                    nomsLocalites = TableauChaines.ajouterElement(nomsLocalites, localite);

                    for (int i = 1; i <= NB_JOURS; i++) {
                        date = Date.ajouterJours(Date.aujourdhui(), i);
                        jour[i - 1] = Date.nomJourSemaine(Date.numeroJourSemaine(date)).substring(0, 3).toUpperCase() + " " + date[0];
                        nomJour[i - 1] = Date.nomJourSemaine(Date.numeroJourSemaine(date)).toLowerCase();
                        System.out.printf("%s %d ? ", Date.nomJourSemaine(Date.numeroJourSemaine(date)), date[0]);
                        tempArray[i - 1] = Console.lireDouble();
                    }

                    temperatures = Tableau2D.ajouterLigne(temperatures, tempArray);
                    System.out.println();
                    break;

                case 2:
                    if(nomsLocalites.length == 0) {
                        System.out.println("\nAucune localité encodée !\n");
                        break;   
                    }

                    System.out.print("\t\t");
                    for (int i = 0; i < jour.length; i++) {
                        System.out.printf("\t%s", jour[i]);
                    }
                    System.out.println();

                    for (int i = 0; i < temperatures.length; i++) {
                        System.out.printf("%-20s", nomsLocalites[i]);
                        for (int j = 0; j < temperatures[i].length; j++) {
                            System.out.printf("\t%.1f", temperatures[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    if(nomsLocalites.length == 0) {
                        System.out.println("\nAucune localité encodée !\n");
                        break;
                    }

                    double[] moyenneLoc, moyenneJour;

                    moyenneLoc = Tableau2D.moyennesParLigne(temperatures);
                    int locMax = TableauReel.maximum(moyenneLoc);
                    int locMin = TableauReel.minimum(moyenneLoc);

                    moyenneJour = Tableau2D.moyennesParColonne(temperatures);
                    int jourMax = TableauReel.maximum(moyenneJour);
                    int jourMin = TableauReel.minimum(moyenneJour);

                    System.out.printf("La localité où il fera le plus chaud est %s avec %.1f°C\n", nomsLocalites[locMax], moyenneLoc[locMax]);
                    System.out.printf("La localité où il fera le plus froid est %s avec %.1f°C\n", nomsLocalites[locMin], moyenneLoc[locMin]);
                    System.out.printf("Le jour le plus chaud est le %s avec %.1f°C\n", nomJour[jourMax], moyenneJour[jourMax]);
                    System.out.printf("Le jour le plus froid est le %s avec %.1f°C\n", nomJour[jourMin], moyenneJour[jourMin]);
                    System.out.println();
                    break;
            }
        }
        System.out.println("\nFin du programme.\n");
    }
}
