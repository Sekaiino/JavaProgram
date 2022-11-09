package labo3;

public class PremieresFonctions {
    public static void main(String[] args) {
        int a = 11, b = 4;

        afficher(27);
        afficher(a);
        afficher(b);

        afficher(soustraire(1, 3));
        afficher(soustraire(a, b));
        afficher(soustraire(b, a));
    }

    public static void afficher(int a) {
        System.out.println(a);
    }

    public static int soustraire(int a, int b) {
        return a - b;
    }
}
