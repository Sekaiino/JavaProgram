package labo5;

public class De {
    public static void main(String[] args) {
        int i = 0, nb;

        System.out.print("Nombre de 1 à 6 ? ");
        nb = prb.Console.lireInt();

        while(true) {
            int rand = (int)(Math.random() * 6) + 1;
            System.out.println(rand);
            if(rand == nb) {
                System.out.printf("Nombre de lancés = %d\n", i);
                return;
            }
            i++;
        }
    }
}
