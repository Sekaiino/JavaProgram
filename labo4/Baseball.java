package labo4;

public class Baseball {
    public static void main(String[] args) {
        char temps;
        double hum;

        System.out.print("Quel temps fait-il ? ((N)uageux, (E)nsoleillé, (P)luvieux) ");
        temps = prb.Console.lireChar();
        temps = Character.toLowerCase(temps);
        
        while(!(temps == 'e' || temps == 'n' || temps == 'p')) {
            System.out.println("Veuillez entrez une valeur correcte ! (e, n, p)");
            System.out.print("Quel temps fait-il ? ((N)uageux, (E)nsoleillé, (P)luvieux) ");
            temps = prb.Console.lireChar();
            temps = Character.toLowerCase(temps);
        }

        switch(temps) {
            case 'n':
                System.out.println("Vous pouvez jouer");
                break;
            
            case 'p':
                System.out.println("Le match est reporté");
                break;

            case 'e':
                System.out.print("Taux d'humidité en % ? ");
                hum = prb.Console.lireDouble();

                while(hum < 0 || hum > 100) {
                    System.out.println("Taux d'humidité incorrect ! Veuillez entrez une valeur correcte");
                    System.out.print("Taux d'humidité en % ? ");
                    hum = prb.Console.lireDouble();
                }

                if(hum < 90) {
                    System.out.println("Vous pouvez jouer");
                } else {
                    System.out.println("Le match est reporté");
                }
                break;
        }
    }
}
