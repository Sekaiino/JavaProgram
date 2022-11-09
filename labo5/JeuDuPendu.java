package labo5;

import io.Fichier;
import io.Aleatoire;
import io.Console;

import java.nio.charset.Charset;
import java.util.*;

public class JeuDuPendu {
    public static void main(String[] args) {
        int nbErreurs = 0, index;
        String mot, motCache, oldMotCache, lettreJoue="";
        char response;

        List<String> lignes = Fichier.lireToutesLesLignes("data/dictionnaire.txt", Charset.defaultCharset());
        mot = lignes.get(Aleatoire.aleatoire(0, lignes.size()));
        motCache = genererMotCache(mot.length());
        
        while(nbErreurs < 7) {
            System.out.println(genererPotence(nbErreurs));
            System.out.println("");
            System.out.printf("Mot caché      = %s\n", motCache);
            System.out.printf("Lettres jouées = %s\n\n", lettreJoue);
            System.out.print("Une lettre ? ");
            
            response = Console.lireChar();
            response = Character.toUpperCase(response);
            index = lettreJoue.indexOf(response);
            
            while(index != -1) {
                System.out.print("Lettre déjà utilisée, veuillez réessayer : ");
                response = Console.lireChar();
                response = Character.toUpperCase(response);
                index = lettreJoue.indexOf(response);
            }

            oldMotCache = motCache;
            motCache = devoilerLettre(motCache, mot, response);
            lettreJoue += response;

            if(motCache == oldMotCache) {
                nbErreurs++;
            }
        }
        System.out.println(genererPotence(nbErreurs));
        if(nbErreurs == 7) {
            System.out.printf("Vous avez perdu ! Le mot était \"%s\"\n", mot);
        } else {
            System.out.println("Bravo ! Vous avez gagné !");
        }
    }

    private static String genererMotCache(int nbLettres) {
        String motCache = "";
        for (int i = 0; i < nbLettres; i++) {
            motCache += "-";
        }
        return motCache;
    }

    private static String genererPotence(int nbErreurs) {
        switch(nbErreurs) {
            case 0:
                return " ______\n |\n |\n |\n |\n_|_";
            case 1:
                return " ______\n |    |\n |\n |\n |\n_|_";
            case 2:
                return " ______\n |    |\n |    O\n |\n |\n_|_";
            case 3:
                return " ______\n |    |\n |    O\n |    |\n |\n_|_";
            case 4:
                return " ______\n |    |\n |    O\n |   /|\n |\n_|_";
            case 5:
                return " ______\n |    |\n |    O\n |   /|\\\n |\n_|_";
            case 6:
                return " ______\n |    |\n |    O\n |   /|\\\n |   /\n_|_";
            case 7:
                return " ______\n |    |\n |    O\n |   /|\\\n |   / \\\n_|_";
            default:
                return "Error";
        }
    }

    private static String devoilerLettre(String motCache, String motATrouver, char lettre) {
        int index = motATrouver.indexOf(lettre);
        if(index != -1) {
            for (int i = 0; i < motATrouver.length(); i++) {

                if(motATrouver.charAt(i) == lettre) {
                    motCache = motCache.substring(0, i) + lettre + motCache.substring(i + 1, motCache.length());
                }
            }
        }
        return motCache;
    }
}
