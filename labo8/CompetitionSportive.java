package labo8;

import io.*;

public class CompetitionSportive {
    public static String[] encoderNomsEquipes(int nbEquipes) {
        String[] a = new String[nbEquipes];
        String e;

        for (int i = 0; i < nbEquipes; i++) {
            do {
                System.out.printf("Equipe %d ? ", i+1);
                e = Console.lireString();

            } while(TableauChaines.contient(a, e) || e.trim().isEmpty());

            a[i] = e;
        }

        return a;
    }

    public static void decalerADroite(String[] nomsEquipes) {
        String last = nomsEquipes[nomsEquipes.length - 1];

        for (int i = nomsEquipes.length - 1; i > 0; i--) {
            nomsEquipes[i] = nomsEquipes[i-1];
            if(i==1)
            {
                nomsEquipes[0] = last;
            }
        }
    }

    public static String[][] journeeSuivante(String[] nomsEquipes) {
        String[][] a = new String[nomsEquipes.length / 2][2];
        int i=0;

        decalerADroite(nomsEquipes);
        TableauChaines.permuter(nomsEquipes, 0, 1);

        for (int k = 0, l = nomsEquipes.length - 1; k < nomsEquipes.length / 2; k++, l--) {
            a[i][0] = nomsEquipes[k];
            a[i][1] = nomsEquipes[l];
            i++;
            if(i == nomsEquipes.length / 2) break;
        }

        return a;
    }

    public static String rencontreToString(String[] rencontre) {
        return String.format("%s - %s\n", rencontre[0], rencontre[1]);
    }

    public static String journeeToString(String[][] journee) {
        String a = "";
        for (int i = 0; i < journee.length; i++) {
            a += rencontreToString(journee[i]);
        }

        return a;
    }

    public static String[] getRencontre(String[][] journee, String nomEquipe) {

        for (int i = 0; i < journee.length; i++) {
            for (int j = 0; j < journee[i].length; j++) {
                if (journee[i][j].equals(nomEquipe)) return journee[i];
            }
        }
        return null;
    }

    public static int choisirEquipe(String[] nomsEquipes) {
        int choix;
        do {
            for (int i = 1; i <= nomsEquipes.length; i++) {
                System.out.printf("%d.\t%s\n", i, nomsEquipes[i-1]);
            }
            System.out.print("Choix ? ");
            choix = Console.lireInt();
            if(choix <= 0 || choix > nomsEquipes.length) System.out.println("\nVeuillez entrer un choix valide !");

        } while(choix <= 0 || choix > nomsEquipes.length);

        return choix;
    }
}
