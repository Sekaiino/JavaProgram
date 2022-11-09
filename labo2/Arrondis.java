package labo2;

public class Arrondis {
    public static void main(String[] args) {
        double[] values = {-5.7, -5.5, -5.2, -5., 5., 5.2, 5.5, 5.7};
        double ceilResult, floorResult, rintResult, roundResult;

        System.out.println("ceil    floor   rint    round");
        
        for (int i = 0; i < values.length; i++) {
            ceilResult = Math.ceil(values[i]);
            floorResult = Math.floor(values[i]);
            rintResult = Math.rint(values[i]);
            roundResult = Math.round(values[i]);

            if (values[i] < 0) {
                System.out.printf("%.1f\t%.1f\t%.1f\t%.1f\n", ceilResult, floorResult, rintResult, roundResult);
            } else {
                System.out.printf(" %.1f\t %.1f\t %.1f\t %.1f\n", ceilResult, floorResult, rintResult, roundResult);
            }
        }
    }
}