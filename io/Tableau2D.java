package io;

public class Tableau2D {
    public static void afficher(char[][] t) {
        for (char[] cs : t) {
            for (char cs2 : cs) {
                System.out.printf("%c ", cs2);
            }
            System.out.println();
        }
    }

    public static double[][] ajouterLigne(double[][] t, double[] ligne) {
        double newArray[][] = new double[t.length + 1][ligne.length];

        System.arraycopy(t, 0, newArray, 0, t.length);
        for (int i = 0; i < ligne.length; i++) {
            newArray[newArray.length - 1][i] = ligne[i];
        }

		return newArray;
    }

    public static double[] moyennesParLigne(double[][] t) {
        double[] moyenne = new double[t.length];

        if(t.length == 0) return moyenne;

        for (int i = 0; i < t.length; i++) {
            moyenne[i] = TableauReel.moyenne(t[i]);
        }

        return moyenne;
    }

    public static double[] extraireColonne(double[][] t, int j) {
        double[] column = new double[t.length];

        if(t.length == 0) return column;

        for (int i = 0; i < column.length; i++) {
            column[i] = t[i][j];
        }
        return column;
    }

    public static double[] moyennesParColonne(double[][] t) {
        double[] moyenne = new double[t[0].length];

        if(t.length == 0) return moyenne;

        for (int i = 0; i < t[0].length; i++) {
            moyenne[i] = TableauReel.moyenne(extraireColonne(t, i));
        }

        return moyenne;
    }
}