package labo8;

import io.*;

public class Motifs {
    public static void main(String[] args) {
        char[][] carre = creerMotifCarre(7);
        Tableau2D.afficher(carre);
        System.out.println();

        char[][] triangle = creerMotifTriangles(7);
        Tableau2D.afficher(triangle);
        System.out.println();

        char[][] x = creerMotifX(7);
        Tableau2D.afficher(x);
        System.out.println();

        char[][] papillon = creerMotifPapillon(7);
        Tableau2D.afficher(papillon);
        System.out.println();
        
        char[][] losange = creerMotifLosange(7);
        Tableau2D.afficher(losange);
        System.out.println();
    }

    private static char[][] creerMotifCarre(int taille) {
        char[][] a = new char[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                a[i][j] = '*';
            }
        }

        return a;
    }

    private static char[][] creerMotifTriangles(int taille) {
        char[][] a = new char[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if(j >= i) {
                    a[i][j] = '*';
                } else {
                    a[i][j] = '.';
                }
            }
        }

        return a;
    }

    private static char[][] creerMotifX(int taille) {
        char[][] a = new char[taille][taille];
        
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if(i == j || i + j == taille -1) {
                    a[i][j] = '*';
                } else {
                    a[i][j] = '.';
                }
            }
        }
        
        return a;
    }
    
    private static char[][] creerMotifPapillon(int taille) {
        char[][] a = new char[taille][taille];
        int l = 0, h = taille - 1;

        
        for (int i = 0; i < taille; i++) {

            for (int j = 0; j < taille; j++) {
                a[i][j] = '.';
            }
            
            for (int j = 0; j <= l; j++) {
                a[i][j] = '*';
            }

            for (int j = h; j < taille; j++) {
                a[i][j] = '*';
            }
            
            if(i <= (taille - 2) / 2) {
                l++;
                h--;

            } else {
                l--;
                h++;
            }
        }

        return a;
    }

    private static char[][] creerMotifLosange(int taille) {
        char[][] a = new char[taille][taille];
        int nbCar = 1;

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {

                if(j >= (taille - nbCar) / 2 && j < taille - ((taille - nbCar) / 2)) {
                    a[i][j] = '*';
                    
                } else {
                    a[i][j] = '.';
                }
            }

            if(i < (taille - 1) / 2) {
                nbCar += 2;
            } else {
                nbCar -= 2;
            }
        }
        return a;
    }
}
