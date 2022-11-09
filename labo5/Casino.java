package labo5;

import io.Console;

public class Casino {
    public static void main(String[] args) {
        int i = 0,t = 0;

        System.out.print("Mise de départ ? ");
        int md = Console.lireInt();
        if(md <= 0) {
            System.out.println("Mise incorrecte");
        }

        System.out.print("Gains souhaités ? ");
        int gs = Console.lireInt();

        while(md < gs) {
            double rand = Math.random();
            if(rand < 0.5) {
                t += 1;
                md += 1;
            } else {
                md -= 1;
            }
            i += 1;
        }
        System.out.printf("Vous avez réussi %d paris sur %d\n", t, i);
        System.out.printf("Vous repartez avec %d EUR de plus\n", gs);
    }
}
