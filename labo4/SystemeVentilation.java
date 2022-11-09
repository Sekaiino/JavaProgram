package labo4;

public class SystemeVentilation {
    public static void main(String[] args) {
        char temps, choix;
        double hum;

        System.out.print("Quel est le type de chauffage : (A)ir chaud puisé, (C)ombustion ? ");
        temps = prb.Console.lireChar();
        temps = Character.toLowerCase(temps);
        
        while(!(temps == 'a' || temps == 'c')) {
            System.out.println("Veuillez entrez une valeur correcte ! (a, c)");
            System.out.print("Quel est le type de chauffage : (A)ir chaud puisé, (C)ombustion ? ");
            temps = prb.Console.lireChar();
            temps = Character.toLowerCase(temps);
        }

        switch(temps) {
            case 'a':
                System.out.print("Le sol est-il saturé de gaz : (O)ui, (N)on ?  ");
                choix = prb.Console.lireChar();
                choix = Character.toLowerCase(choix);
                
                while(!(choix == 'o' || choix == 'n')) {
                    System.out.println("Veuillez entrez une valeur correcte ! (o, n)");
                    System.out.print("Le sol est-il saturé de gaz : (O)ui, (N)on ? ");
                    choix = prb.Console.lireChar();
                    choix = Character.toLowerCase(choix);
                }

                if(choix == 'o') {
                    System.out.println("Installer des ventilateurs d'alimentation et d'extraction");
                } else {
                    System.out.println("Installer des ventilateurs d'extraction");
                }
                break;

            case 'c':
                System.out.print("Taux d'humidité en % ? ");
                hum = prb.Console.lireDouble();
        
                while(hum < 0 || hum > 100) {
                    System.out.println("Taux d'humidité incorrect ! Veuillez entrez une valeur correcte");
                    System.out.print("Taux d'humidité en % ? ");
                    hum = prb.Console.lireDouble();
                }
        
                if(hum <= 70) {
                    System.out.println("Installer des ventilateurs d'alimentation");
                } else {
                    System.out.println("Installer des ventilateurs d'alimentation et d'extraction");
                }
                break;
        }
    }
}
