package prb;

public class Cercle {
    public static void main(String[] args) {

        double rayon = 9.8;
        double perimetre, aire;

        perimetre = 2 * Math.PI * rayon;
        aire = Math.PI * Math.pow(rayon, 2);
        
        System.out.println(perimetre);
        System.out.println(aire);
    }
}