package labo5;

public class MatchDeTennis {
    public static void main(String[] args) {
        int pointsJ1 = 0, pointsJ2 = 0;
        String gagnant = "gr";

        System.out.print("Joueur 1 ? ");
        String j1 = prb.Console.lireString();

        System.out.print("Joueur 2 ? ");
        String j2 = prb.Console.lireString();

        while(true) {
            System.out.printf("%s %s\n", j1, getScore(pointsJ1));
            System.out.printf("%s %s\n", j2, getScore(pointsJ2));

            System.out.print("Quel joueur gagne le point (1 ou 2) ? ");
            if(prb.Console.lireInt() == 1) {
                pointsJ1++;
            } else {
                pointsJ2++;
            }

            if(Math.abs(pointsJ1 - pointsJ2) < 2) {
                if(pointsJ1 == 4 && pointsJ2 == 4) {
                    pointsJ1 = 3;
                    pointsJ2 = 3;
                }
            }
            else if(Math.abs(pointsJ1 - pointsJ2) >= 2 && pointsJ1 >= 3 || pointsJ2 >= 3) {
                if(Math.max(pointsJ1, pointsJ2) == pointsJ1) {
                    gagnant = j1;
                    break;
                } else {
                    gagnant = j2;
                    break;
                }
            }
        }
        System.out.printf("\n%s remporte le match !\n", gagnant);
    }

    private static String getScore(int points) {
        switch(points) {
            case 0:
                return "0";
            case 1:
                return "15";
            case 2:
                return "30";
            case 3:
                return "40";
            case 4:
                return "A";
            default:
                return "Error";
        }
    }
}
