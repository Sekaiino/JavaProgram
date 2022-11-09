package labo5;

public class FizzBuzzVariante {
    public static void main(String[] args) {
        System.out.print("Dernier nombre ? ");
        int nombre = prb.Console.lireInt();

        for (int i = 1; i <= nombre; i++) {
            if(contientChiffre(i, 3) && contientChiffre(i, 5)) {
                System.out.print("FizzBuzz, ");
            }
            else if(contientChiffre(i, 3)) {
                System.out.print("Fizz, ");
            } 
            else if(contientChiffre(i, 5)) {
                System.out.print("Buzz, ");
            } else {
                System.out.printf("%d, ", i);
            }
        }
    }

    public static boolean contientChiffre(int nombre, int chiffre) {
        if(nombre % 10 == chiffre || nombre / 10 == chiffre) {
            return true;
        }
        return false;
    }
}
