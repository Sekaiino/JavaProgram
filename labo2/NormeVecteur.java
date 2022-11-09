package labo2;

public class NormeVecteur {
    public static void main(String[] args) {
        double x, y, norme;

        System.out.print("Composante x du vecteur ? ");
        x = prb.Console.lireDouble();
        System.out.print("Composante y du vecteur ? ");
        y = prb.Console.lireDouble();

        norme = Math.abs(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

        System.out.printf("La norme du vecteur (%.1f, %.1f) vaut %.1f\n", x, y, norme);
    }
}