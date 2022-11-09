package labo3;

public class NormeVecteur {
    public static void main(String[] args) {
        double x, y, norme;

        System.out.print("Composante x du vecteur ? ");
        x = prb.Console.lireDouble();
        System.out.print("Composante y du vecteur ? ");
        y = prb.Console.lireDouble();

        norme = calculerNormeVecteur(x, y);

        System.out.printf("La norme du vecteur (%.1f, %.1f) vaut %.1f\n", x, y, norme);
    }

    public static double calculerNormeVecteur(double a, double b) {
        return Math.abs(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }
}