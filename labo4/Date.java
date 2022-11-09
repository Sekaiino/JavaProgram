package labo4;

import java.time.*;
import java.util.regex.Pattern;

public class Date {
    /**
     * Verifie si une année est bissextile
     * @param annee année à vérifier
     * @return boolean, true si bissextile/false sinon
     */
    public static boolean estBissextile(int annee) {
        if(annee % 400 == 0) {
            return true;
        }
        else if(annee % 100 == 0) {
            return false;
        }
        else if(annee % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int joursParMois(int mois, int annee) {
        if(mois < 1 || mois > 12) {
            return 0;
        } else {
            return Month.of(mois).length(Year.isLeap(annee));
        }
    }

    public static int getJour(String date) {
        return Integer.parseInt(date.substring(0, date.indexOf("/")));
    }

    public static int getMois(String date) {
        int index = date.indexOf("/");
        return Integer.parseInt(date.substring(index + 1, date.indexOf("/", index + 1)));
    }

    public static int getAnnee(String date) {
        int index = date.indexOf("/");
        index = date.indexOf("/", index + 1);
        return Integer.parseInt(date.substring(index + 1, date.length()));
    }

    public static String formaterDate(int jour, int mois, int annee) {
        String jj, mm;

        if(jour < 10) {
            jj = "0" + String.valueOf(jour);
        } else {
            jj = String.valueOf(jour);
        }
        if(mois < 10) {
            mm = "0" + String.valueOf(mois);
        } else {
            mm = String.valueOf(mois);
        }
        return jj + "/" + mm + "/" + String.valueOf(annee);
    }

    public static boolean estValide(String date) {
        if(!Pattern.matches("^[0-3]?[0-9]/[0|1]?[0-9]/\\d{4}$", date)) {
            return false;
        }
        return true;
    }

    public static boolean estValide(int jour, int mois, int annee) {
        int jm = joursParMois(mois, annee);
        if(!(jour <= jm && jour > 0)) {
            return false;
        }
        return true;
    }
}
