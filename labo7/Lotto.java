package labo7;

import java.util.Arrays;

import io.*;

public class Lotto {
    static int[] genererTirage(int nbTirages, int numeroMax) {
        int[] num = new int[numeroMax];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        int j = num.length - 1;

        int[] tirage = new int[nbTirages];
        for (int i = 0; i < nbTirages; i++) {
            int p = Aleatoire.aleatoire(0, j);
            tirage[i] = num[p];
            TableauEntiers.permuter(num, p, j);
            j--;
        }
        Arrays.sort(tirage);
        return tirage;
    }

    static int[] encoderGrille(int nbNumeros, int numeroMax) {
        int nb;
        int[] grille = new int[nbNumeros];

        for (int i = 0; i < nbNumeros; i++) {
            System.out.printf("Numéro %d ? ", i + 1);
            nb = Console.lireInt();

            while(nb > numeroMax || TableauEntiers.contient(grille, nb)) {
                System.out.println("Numéro supérieur au maximum ou déjà encodé, veuillez réessayer");
                System.out.printf("Numéro %d ? ", i + 1);
                nb = Console.lireInt();
            }

            grille[i] = nb;
        }
        return grille;
    }

    static int[] compterNumerosGagnants(int[] tirage, int[] grille) {
        int[] gagnant = new int[2];
        int nbGagnant = 0;

        for (int i = 0; i < grille.length; i++) {

            for (int j = 0; j < tirage.length; j++) {
                if(grille[i] == tirage[j] && j == tirage.length - 1) {
                    gagnant[1] = 1;

                } else if(grille[i] == tirage[j]) {
                    nbGagnant ++;
                }
            }
        }
        gagnant[0] = nbGagnant;
        return gagnant;
    }

    static int determinerRang(int[] numerosGagnants) {
        if(numerosGagnants[1] == 1) {
            return (7 - (numerosGagnants[0])) * 2 - 2;
        } else {
            return (7 - (numerosGagnants[0])) * 2 - 1;
        }

    }

    static double obtenirGain(int rang) {
        switch(rang) {
            case 1:
                return 500000.00; 
            case 2:
                return 75000.00;
            case 3:
                return 1500.00;
            case 4:
                return 250.00;
            case 5:
                return 30.00;
            case 6:
                return 10.00;
            case 7:
                return 5.00;
            case 8:
                return 3.00;
            default:
                return 0.00;

        }
    }
}
