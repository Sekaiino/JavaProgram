package labo4;

public class Lendemain {
    public static void main(String[] args) {

        System.out.print("Date au format (j)j/(m)m/aaaa ? ");
        String date = prb.Console.lireString();

        if(!Date.estValide(date)) {
            System.out.println("Format de date incorrect !");
            return;
        }

        int jour = Date.getJour(date);
        int mois = Date.getMois(date);
        int annee = Date.getAnnee(date);

        if(!Date.estValide(jour, mois, annee)) {
            System.out.println("Format de date incorrect !");
            return;
        }

        if(mois == 2) {
            if(Date.estBissextile(annee) && jour == 29) {
                jour = 1;
                mois += 1; 
            } else if(Date.estBissextile(annee) && jour == 28) {
                jour = 29;
            } else {
                jour += 1;
            }
        } else {
            int nbJour = Date.joursParMois(mois, annee);
            if(jour == nbJour) {
                jour = 1;
                if(mois == 12) {
                    mois = 1;
                    annee += 1;
                } else {
                    mois += 1;
                }
            } else {
                jour += 1;
            }
        }

        date = Date.formaterDate(jour, mois, annee);
        System.out.printf("Date du lendemain = %s\n", date);
    }
}
