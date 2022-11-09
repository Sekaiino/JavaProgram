package labo5;

public class FacteursPremiers {
    public static void main(String[] args) {
        System.out.print("Entier >= 2 ? ");
        int entier = prb.Console.lireInt();

        System.out.printf("Décomposition de %d en produit de facteurs premiers = ", entier);

        while(entier != 1) {
            for (int i = 2; i < 20; i++) {
                if(entier % i == 0) {
                    entier /= i;
                    System.out.printf("%d ", i);
                    break;
                }
            }
        }
    }
}
