package prb;

public class PermutationLettres {
    public static void main(String[] args) {
        String prenom;

        System.out.print("Prenom ? ");
        prenom = Console.lireString();

        prenom = Character.toUpperCase(prenom.charAt(prenom.length()-1)) + prenom.substring(1, prenom.length() - 1) + Character.toLowerCase(prenom.charAt(0));

        System.out.println(prenom);
    }
}
