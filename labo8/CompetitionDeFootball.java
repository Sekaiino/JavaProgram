package labo8;

import io.Console;

public class CompetitionDeFootball {
    public static void main(String[] args) {
        int menu = 0, nbEquipes, choixEquipe;
        String[] equipes = null, rawEquipes = null;
        String[][] journee;

        while(menu != 4) {
            System.out.println("Compétition de football");
            do {
                System.out.println("1. Encoder les équipes");
                System.out.println("2. Afficher le calendrier de la compétition");
                System.out.println("3. Afficher le calendrier d'une équipe");
                System.out.println("4. Quitter");
                System.out.print("Choix ? ");
                menu = Console.lireInt();

                if(menu < 1 || menu > 4) System.out.println("\nChoix incorrect !\n");

            } while(menu < 1 || menu > 4);

            System.out.println();

            if(menu < 1 || menu > 4) {
                System.out.println("Choix incorrect !");
                continue;
            }

            switch(menu) {
                case 1:
                    do {
                        System.out.print("Nombre d'équipes ? ");
                        nbEquipes = Console.lireInt();

                        if(nbEquipes < 2) System.out.println("Veuillez entrer un nombre d'équipes supérieur ou égal à 2 !");
                        if(nbEquipes % 2 != 0) System.out.println("Veuillez entrer un nombre d'équipes pair !");
                        if(nbEquipes > 20) System.out.println("Veuillez entrer un nombre d'équipes inférieur à 20 !");

                    } while(nbEquipes < 2 || nbEquipes % 2 != 0 || nbEquipes > 20);

                    rawEquipes = CompetitionSportive.encoderNomsEquipes(nbEquipes);

                    equipes = new String[rawEquipes.length];
                    for (int i = 0; i < rawEquipes.length; i++) {
                        equipes[i] = rawEquipes[i];
                    }

                    System.out.println();
                    break;

                case 2:
                    if(rawEquipes == null) {
                        System.out.println("Veuillez d'abord entrer les noms d'équipes !\n");
                        break;
                    }

                    for (int i = 0; i < equipes.length - 1; i++) {
                        journee = CompetitionSportive.journeeSuivante(equipes);
                        System.out.println("Journée " + (i + 1) + ":");
                        System.out.println(CompetitionSportive.journeeToString(journee));
                    }

                    for (int i = 0; i < rawEquipes.length; i++) {
                        equipes[i] = rawEquipes[i];
                    }
                    break;

                case 3:
                    if(rawEquipes == null) {
                        System.out.println("Veuillez d'abord entrer les noms d'équipes !\n");
                        break;
                    }

                    choixEquipe = CompetitionSportive.choisirEquipe(rawEquipes);
                    System.out.println();

                    for (int i = 0; i < equipes.length - 1; i++) {
                        journee = CompetitionSportive.journeeSuivante(equipes);

                        System.out.println("Journée " + (i + 1) + ":");
                        System.out.print(CompetitionSportive.rencontreToString(CompetitionSportive.getRencontre(journee, equipes[choixEquipe -1])));
                        System.out.println();
                    }

                    for (int i = 0; i < rawEquipes.length; i++) {
                        equipes[i] = rawEquipes[i];
                    }
                    break;
            }
        }
        System.out.println("\nFin du programme.\n");
    }
}
