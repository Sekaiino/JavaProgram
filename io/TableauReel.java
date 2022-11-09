package io;

public class TableauReel {
    public static int minimum(double[] t) {
        if(t.length == 0) return -1;

        int index = 0;
        double min = t[index];
        for (int i = 1; i < t.length; i++) {
            if(t[i] <= min) {
                min = t[i];
                index = i;
            }
        }

        return index;
    }

    public static int maximum(double[] t) {
        if(t.length == 0) return -1;

        int index = 0;
        double max = t[index];
        for (int i = 1; i < t.length; i++) {
            if(t[i] >= max) {
                max = t[i];
                index = i;
            }
        }

        return index;
    }

    public static double moyenne(double[] t) {
        if(t.length == 0) return Double.NaN;

        double moyenne = 0;
        for (int i = 0; i < t.length; i++) {
            moyenne += t[i];
        }

        return moyenne / t.length;
    }
}
