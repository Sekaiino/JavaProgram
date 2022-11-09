package io;


import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @org.junit.Test
    public void testAjouterElement() {
        assertArrayEquals(new String[] {"Bruxelles", "Eupen", "Liège", "Ostende"}, TableauChaines.ajouterElement(new String[] {"Bruxelles", "Eupen", "Liège"}, "Ostende"));
    }

    @org.junit.Test
    public void testAjouterLigne() {
        double[][] base = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double[][] fin = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        assertArrayEquals(fin, Tableau2D.ajouterLigne(base, new double[] {7.0, 8.0, 9.0}));
    }

    @org.junit.Test
    public void testMoyenneLigne() {
        double[][] arg = {{7.0, 2.5, 4.0}, {1.0, 8.0, 6.0}};
        assertArrayEquals(new double[] {4.5, 5.0}, Tableau2D.moyennesParLigne(arg));
        assertArrayEquals(new double[] {}, Tableau2D.moyennesParLigne(new double[][] {}));
    }

    @org.junit.Test
    public void testExtraireColonne() {
        double[][] arg = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        assertArrayEquals(new double[] {3.0, 6.0}, Tableau2D.extraireColonne(arg, 2));
        assertArrayEquals(new double[] {}, Tableau2D.extraireColonne(new double[][] {}, 2));
    }

    @org.junit.Test
    public void testMoyenneParColonne() {
        double[][] arg = {{7.0, 2.5, 4.0}, {1.0, 8.0, 6.0}};
        assertArrayEquals(new double[] {4.0, 5.25, 5.0}, Tableau2D.moyennesParColonne(arg));
    }
}
