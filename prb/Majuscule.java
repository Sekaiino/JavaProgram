package prb;

public class Majuscule {
    public static void main(String[] args) {
        String prenom;

        System.out.print("Prenom ? ");
        prenom = Console.lireString();

        prenom = Character.toUpperCase(prenom.charAt(0)) + prenom.substring(1).toLowerCase();

        System.out.printf("Bienvenue %s !\n", prenom);
    }
}
