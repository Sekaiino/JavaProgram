package labo5;

public class MatchDeTennisComplet {
    public static void main(String[] args) {
        int pointsJ1 = 0, pointsJ2 = 0, nbSetJ1 = 0, nbSetJ2 = 0, nbJeuxJ1 = 0, nbJeuxJ2 = 0, interval = 2;
        String gagnant = "gr";

        System.out.print("Joueur 1 ? ");
        String j1 = prb.Console.lireString();

        System.out.print("Joueur 2 ? ");
        String j2 = prb.Console.lireString();

        while(true) {
            System.out.printf("%s %d | %d | %s\n", j1, nbSetJ1, nbJeuxJ1, getScore(pointsJ1));
            System.out.printf("%s %d | %d | %s\n", j2, nbSetJ2, nbJeuxJ2, getScore(pointsJ2));

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
                    nbJeuxJ1++;
                    pointsJ2 = 0;
                    pointsJ1 = 0;
                } else {
                    nbJeuxJ2++;
                    pointsJ2 = 0;
                    pointsJ1 = 0;
                }
            }

            if(Math.abs(nbJeuxJ1 - nbJeuxJ2) < 2) {
                if(nbJeuxJ1 == 6 && nbJeuxJ2 == 6) {
                    interval = 1;
                }
            }
            else if(interval == 1 && Math.abs(nbJeuxJ1 - nbJeuxJ2) < 1) {
                if(Math.max(nbJeuxJ1, nbJeuxJ2) == nbJeuxJ1) {
                    gagnant = j1;
                    nbSetJ1++;
                    pointsJ2 = 0;
                    pointsJ1 = 0;
                    interval = 0;
                } else {
                    gagnant = j2;
                    nbSetJ2++;
                    pointsJ2 = 0;
                    pointsJ1 = 0;
                    interval = 0;
                }
            }
            
            if(nbSetJ1 == 2) {
                gagnant = j1;
                break;
            } else if(nbSetJ2 == 2) {
                gagnant = j2;
                break;
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
