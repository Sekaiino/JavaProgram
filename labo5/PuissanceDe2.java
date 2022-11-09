package labo5;

public class PuissanceDe2 {
    public static void main(String[] args) {
        int ans = 2;
        System.out.print("Exposant maximum ? ");
        int pm = prb.Console.lireInt();
        System.out.println("Exp. Puissance");

        for (int i = 0; i <= pm; i++) {
            for (int j = 2; j <= i; j++) {
                    ans *= 2;    
            }
            if(i == 0) {
                ans = 1;
            }
            System.out.printf("  %d\t%d\n", i, ans);
            ans = 2;
        }
    }
}
